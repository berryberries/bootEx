package com.mysite.sbb;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

// SbbApplicationTestsŬ������ ��������Ʈ �׽�Ʈ Ŭ�������� �ǹ��Ѵ�.
@SpringBootTest
class SbbApplicationTests {
	
	@Autowired 
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void testJpa() {
		
//		// save() : ������ ����
//		Question q1 = new Question();
//		q1.setSubject("sbb�� �����ΰ���?");
//		q1.setContent("sbb�� ���ؼ� �˰� �;��");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1); // ù��° ���� ����
//		
//		Question q2 = new Question();
//		q2.setSubject("��������Ʈ �� �����Դϴ�");
//		q2.setContent("id�� �ڵ����� �����ǳ���");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2); // �ι�° ���� ����
		
//--------------------------------------------------------------------------------		
//		//  findAll() : ���̺� ����� ��絥���� ��ȸ
//		List<Question> all = this.questionRepository.findAll();
//		
//		// JUnit�� assertEquals() : ������ ��밪�� �������� Ȯ���ϴ� �޼ҵ�
//		// assertEquals(��밪, ������) 
//		// JUnit�׽�Ʈ�� ���(���),����(����)���� ��Ÿ����.
//		assertEquals(2,all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb�� �����ΰ���?",q.getSubject());
		
//--------------------------------------------------------------------------------
//		// findById() : ���̵� ������ ������ ��ȸ�ϱ�
//		Optional<Question> oq = this.questionRepository.findById(1);
//		
//		if(oq.isPresent()) {
//			
//			Question q = oq.get();
//			assertEquals("sbb�� �����ΰ���?", q.getSubject());
//		}
		
//--------------------------------------------------------------------------------
//		// findBySubject() :  ��ƼƼ subject�� ������ ��ȸ (where��)
//		Question q = this.questionRepository.findBySubject("sbb�� �����ΰ���?");
//		assertEquals(1, q.getId());
//		
//		// �������̽��� findBySubject() �����ϰ� ���� ���ߴµ� ����Ǵ� ����
//		// -> JPA �������͸��� ����� QuestionRepository��ü�� ������ �� ������
//		//    �������͸� ��ü�� �޼ҵ尡 ����� �� JPA�� �ش� �޼��� ���� �м���
//		//    ������ ����� �����Ѵ�.
		
//--------------------------------------------------------------------------------		
//		// findBySubjectAndContent() : subject�� content�� ��ȸ (where�� + and ����)
//		Question q = this.questionRepository.findBySubjectAndContent("sbb�� �����ΰ���?", "sbb�� ���ؼ� �˰� �;��");
//		assertEquals(1, q.getId());

//--------------------------------------------------------------------------------		
		//findBySubjectLike() : ��ƼƼ�� ���Ե� Ư�� ���ڿ� ��ȸ
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//      Question q = qList.get(0);
//      assertEquals("sbb�� �����ΰ���?", q.getSubject());
//        
//      // %sbb : sbb�� ������ ���ڿ�
//      // sbb% : sbb�� �����ϴ� ���ڿ�
//      // %sbb% : sbb�� ���Ե� ���ڿ�
        
//--------------------------------------------------------------------------------		        
        // ������ ���� (update��)
//		Optional<Question> oq = this.questionRepository.findById(1);
//		
//		// assertTrue(��) : ���� true���� �׽�Ʈ�Ѵ�. 
//      assertTrue(oq.isPresent());
//        
//      //setSubject : set��ƼƼ �޼ҵ�� �����ϰ� save()�޼ҵ�� ����
//      Question q = oq.get();
//      q.setSubject("������ ����");
//      this.questionRepository.save(q);
        
//--------------------------------------------------------------------------------		                
		// delete() : ������ ���� 
//		// ������ ���ڿ��� �ִ��� count()�Լ��� Ȯ��.
//		// count() :  �ش� �������͸��� �� ������ �Ǽ� ����
//		assertEquals(2, this.questionRepository.count());
//        
//		Optional<Question> oq = this.questionRepository.findById(1);
//      assertTrue(oq.isPresent());
//        
//      Question q = oq.get();
//      this.questionRepository.delete(q);
//      assertEquals(1, this.questionRepository.count());
		
//--------------------------------------------------------------------------------        
//		// ��ü ���� �� set() : �亯 ������ ���� �� ���� 
//		// �亯������ ó�� -> �亯 �������͸� �ʿ� : @Autowired
//		Optional<Question> oq = this.questionRepository.findById(2);
//	    assertTrue(oq.isPresent());
//	   
//	    // � ������ �亯���� �˱����ؼ� Question ��ü�� �ʿ��ϴ�.
//	    Question q = oq.get();
//	
//	    Answer a = new Answer();
//	    a.setContent("�� �ڵ����� �����˴ϴ�.");
//	    a.setQuestion(q);  
//	    a.setCreateDate(LocalDateTime.now());
//	    this.answerRepository.save(a);
		
//-------------------------------------------------------------------------------- 
		// id������ �亯 ��ȸ
//		Optional<Answer> oa = this.answerRepository.findById(1);
//      assertTrue(oa.isPresent());
//        
//      Answer a = oa.get();
//      assertEquals(2, a.getQuestion().getId());
//-------------------------------------------------------------------------------- 
		// �亯�� ����� ����ã�� + ������ �޸� �亯ã��
		Optional<Question> oq = this.questionRepository.findById(2);
	    assertTrue(oq.isPresent());
	    
	    Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("�� �ڵ����� �����˴ϴ�.", answerList.get(0).getContent());
        // -> ������ : Question�������͸��� findById()ȣ���ؼ� ��ȸ�ϸ� DB������ ����
        //             �׷��� q.getAnswerList()�� ������ ����Ǳ� ������ �����߻�.
        //			   �亯����Ʈ�� q��ü�� ��ȸ�� �� �������� �ʰ� q.getAnswerList()��
        //			   ȣ���ϴ� ������ �����´�.
        // Lazy ��� : �ʿ��� ������ �������� ���
        // Eager��� : q��ü�� ��ȸ�� �� �亯 ����Ʈ�� ��� �������� ���
        // => �� ������ �׽�Ʈ �ڵ忡���� �߻��� �׽�Ʈ���� �߻� x 
        // -> @Transactional��� : �޼��� ����ɶ� ���� DB���� ����
        
	
	}

}
