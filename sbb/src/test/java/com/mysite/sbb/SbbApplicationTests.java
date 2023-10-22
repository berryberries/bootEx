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

// SbbApplicationTests클래스가 스프링부트 테스트 클래스임을 의미한다.
@SpringBootTest
class SbbApplicationTests {
	
	@Autowired 
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void testJpa() {
		
//		// save() : 데이터 저장
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶어요");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1); // 첫번째 질문 저장
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다");
//		q2.setContent("id는 자동으로 생성되나요");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2); // 두번째 질문 저장
		
//--------------------------------------------------------------------------------		
//		//  findAll() : 테이블에 저장된 모든데이터 조회
//		List<Question> all = this.questionRepository.findAll();
//		
//		// JUnit의 assertEquals() : 데이터 기대값과 실제값을 확인하는 메소드
//		// assertEquals(기대값, 실제값) 
//		// JUnit테스트는 통과(녹색),오류(빨강)으로 나타난다.
//		assertEquals(2,all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?",q.getSubject());
		
//--------------------------------------------------------------------------------
//		// findById() : 아이디 값으로 데이터 조회하기
//		Optional<Question> oq = this.questionRepository.findById(1);
//		
//		if(oq.isPresent()) {
//			
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
//--------------------------------------------------------------------------------
//		// findBySubject() :  엔티티 subject로 데이터 조회 (where문)
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
//		
//		// 인터페이스에 findBySubject() 선언만하고 구현 안했는데 실행되는 이유
//		// -> JPA 레포지터리를 상속한 QuestionRepository객체가 생성될 때 벌어짐
//		//    레포지터리 객체의 메소드가 실행될 때 JPA가 해당 메서드 명을 분석해
//		//    쿼리를 만들고 실행한다.
		
//--------------------------------------------------------------------------------		
//		// findBySubjectAndContent() : subject와 content로 조회 (where문 + and 조건)
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶어요");
//		assertEquals(1, q.getId());

//--------------------------------------------------------------------------------		
		//findBySubjectLike() : 엔티티에 포함된 특정 문자열 조회
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//      Question q = qList.get(0);
//      assertEquals("sbb가 무엇인가요?", q.getSubject());
//        
//      // %sbb : sbb로 끝나는 문자열
//      // sbb% : sbb로 시작하는 문자열
//      // %sbb% : sbb가 포함된 문자열
        
//--------------------------------------------------------------------------------		        
        // 데이터 수정 (update문)
//		Optional<Question> oq = this.questionRepository.findById(1);
//		
//		// assertTrue(값) : 값이 true인지 테스트한다. 
//      assertTrue(oq.isPresent());
//        
//      //setSubject : set엔티티 메소드로 수정하고 save()메소드로 저장
//      Question q = oq.get();
//      q.setSubject("수정된 제목");
//      this.questionRepository.save(q);
        
//--------------------------------------------------------------------------------		                
		// delete() : 데이터 삭제 
//		// 동일한 문자열이 있는지 count()함수로 확인.
//		// count() :  해당 레포지터리의 총 데이터 건수 리턴
//		assertEquals(2, this.questionRepository.count());
//        
//		Optional<Question> oq = this.questionRepository.findById(1);
//      assertTrue(oq.isPresent());
//        
//      Question q = oq.get();
//      this.questionRepository.delete(q);
//      assertEquals(1, this.questionRepository.count());
		
//--------------------------------------------------------------------------------        
//		// 객체 생성 후 set() : 답변 데이터 생성 후 저장 
//		// 답변데이터 처리 -> 답변 레포지터리 필요 : @Autowired
//		Optional<Question> oq = this.questionRepository.findById(2);
//	    assertTrue(oq.isPresent());
//	   
//	    // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//	    Question q = oq.get();
//	
//	    Answer a = new Answer();
//	    a.setContent("네 자동으로 생성됩니다.");
//	    a.setQuestion(q);  
//	    a.setCreateDate(LocalDateTime.now());
//	    this.answerRepository.save(a);
		
//-------------------------------------------------------------------------------- 
		// id값으로 답변 조회
//		Optional<Answer> oa = this.answerRepository.findById(1);
//      assertTrue(oa.isPresent());
//        
//      Answer a = oa.get();
//      assertEquals(2, a.getQuestion().getId());
//-------------------------------------------------------------------------------- 
		// 답변에 연결된 질문찾기 + 질문에 달린 답변찾기
		Optional<Question> oq = this.questionRepository.findById(2);
	    assertTrue(oq.isPresent());
	    
	    Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
        // -> 오류남 : Question레포지터리가 findById()호출해서 조회하면 DB세션이 끊김
        //             그러면 q.getAnswerList()는 세션이 종료되기 때문에 오류발생.
        //			   답변리스트는 q객체를 조회할 때 가져오지 않고 q.getAnswerList()를
        //			   호출하는 시점에 가져온다.
        // Lazy 방식 : 필요한 시점에 가져오는 방식
        // Eager방식 : q객체를 조회할 때 답변 리스트를 모두 가져오는 방식
        // => 이 오류는 테스트 코드에서만 발생함 테스트에서 발생 x 
        // -> @Transactional사용 : 메서드 종료될때 까지 DB세션 유지
        
	
	}

}
