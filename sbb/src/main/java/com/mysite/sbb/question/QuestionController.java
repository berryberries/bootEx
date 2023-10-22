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

// 속성을 포함하는 생성자 생성 - 롬복 제공
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionRepository questionRepository;
	private final QuestionService questionService;
	
	// 게시글 목록
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList);
		
		return "question_list";
	}
	
	// 상세페이지
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
	
	// 매개변수가 다를경우 get메소드와 메소드 명을 같이 쓸수 있음
	// 메서드의 매개변수를 객체로 변경시 해당 속성이 자동 바인딩
	// @Valid : QuestionForm의 @NotEmpty, @Size 등으로 설정한 검증 기능이 동작한다
	// BindingResult : @Valid 애너테이션으로 인해 검증이 수행된 결과를 의미하는 객체 
	//                 @Valid 바로 뒤에 와야함
	@PostMapping("/create")
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			// hasErrors() : true -> 검증실패, #fields.allErrors()로 구할 수 있다.
			return "question_form";
		}
		
		this.questionService.create(questionForm.getSubject(),questionForm.getContent());
		return "redirect:/question/list";
	}
	
	

}
