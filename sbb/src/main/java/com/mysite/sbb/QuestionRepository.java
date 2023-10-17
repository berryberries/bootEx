package com.mysite.sbb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// 리포지터리의 대상이 되는 엔티티의 타입(Question)과 
// 해당 엔티티의 PK의 속성타입(Integer)을 지정해야한다.
public interface QuestionRepository extends JpaRepository<Question,Integer> {

	// DB에 저장하기 위해서는 리포지터리가 필요함
	// 엔티티만으로는 불가능
	// = 그래서 실제 DB와 연동하기 위해 JPA리포지터리가 필요함
	// 리포지터리 : 엔티티에 의해 생성된 데이터베이스 테이블에 접근하는
	// 				메서드들을 사용하기 위한 인터페이스
	
	Question findBySubject(String Subject);
	Question findBySubjectAndContent(String subject, String content);
	
	List<Question> findBySubjectLike(String subject);
}
