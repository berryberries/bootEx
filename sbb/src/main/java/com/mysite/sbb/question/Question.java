package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mysite.sbb.answer.Answer;

import lombok.Getter;
import lombok.Setter;

// 엔티티 사용위해 엔티티 어노테이션 사용 -> 적용해야 JPA가 엔티티로 인식한다.
// 엔티티에서는 세터메소드 구현 안하는게 좋다. -> 데이터 변경 자유로운 세터허용이 안전하지 않다고 판단해서
// 롬복의 Builder어노테이션으로 빌드패턴을 사용하고, 데이터 변경할 때 그에 해당되는 메서드를
// 엔티티에 추가해서 데이터를 변경해야한다.
@Getter
@Setter
@Entity
public class Question {
	
	// 고유번호
	// 아이디 어노테이션 : 아이디속성을 기본키로 지정
	// GeneratedValue 어노테이션
	// 오라클의 시퀸스. 데이터 저장시 속성에 값을 따로 세팅 안해도 자동으로 1씩 증가.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// 제목
	// 컬럼 어노테이션 : 테이블의 컬럼명과 일치
	// length : 컬럼길이 설정
	@Column(length = 200)
	private String subject;
	
	// 내용
	// columnDefinition 어노테이션 : 컬럼의 속성정의 
	// 속성 TEXT : 글자수를 제한할수 없는 경우에 사용
	// 테이블 컬럼으로 인식하고 싶지 않다 : Transient 어노테이션 사용
	@Column(columnDefinition = "TEXT")
	private String content; 
	
	//작성일시  
	private LocalDateTime createDate;
	
	// 질문객체에서 답변 참조시 호출하면 된다.
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
