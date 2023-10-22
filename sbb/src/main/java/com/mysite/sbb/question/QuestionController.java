package com.mysite.sbb.question;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.answer.AnswerForm;

import lombok.RequiredArgsConstructor;

// �Ӽ��� �����ϴ� ������ ���� - �Һ� ����
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionRepository questionRepository;
	private final QuestionService questionService;
	
	// �Խñ� ���
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList);
		
		return "question_list";
	}
	
	// ��������
	@GetMapping(value="/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
		
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		
		return "question_detail";
	}
	
	@GetMapping("/create")
	public String questionCreate(QuestionForm questionForm) {
		return "question_form";
	}
	
	// �Ű������� �ٸ���� get�޼ҵ�� �޼ҵ� ���� ���� ���� ����
	// �޼����� �Ű������� ��ü�� ����� �ش� �Ӽ��� �ڵ� ���ε�
	// @Valid : QuestionForm�� @NotEmpty, @Size ������ ������ ���� ����� �����Ѵ�
	// BindingResult : @Valid �ֳ����̼����� ���� ������ ����� ����� �ǹ��ϴ� ��ü 
	//                 @Valid �ٷ� �ڿ� �;���
	@PostMapping("/create")
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			// hasErrors() : true -> ��������, #fields.allErrors()�� ���� �� �ִ�.
			return "question_form";
		}
		
		this.questionService.create(questionForm.getSubject(),questionForm.getContent());
		return "redirect:/question/list";
	}
	
	

}
