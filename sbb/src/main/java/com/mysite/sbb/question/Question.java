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

// ��ƼƼ ������� ��ƼƼ ������̼� ��� -> �����ؾ� JPA�� ��ƼƼ�� �ν��Ѵ�.
// ��ƼƼ������ ���͸޼ҵ� ���� ���ϴ°� ����. -> ������ ���� �����ο� ��������� �������� �ʴٰ� �Ǵ��ؼ�
// �Һ��� Builder������̼����� ���������� ����ϰ�, ������ ������ �� �׿� �ش�Ǵ� �޼��带
// ��ƼƼ�� �߰��ؼ� �����͸� �����ؾ��Ѵ�.
@Getter
@Setter
@Entity
public class Question {
	
	// ������ȣ
	// ���̵� ������̼� : ���̵�Ӽ��� �⺻Ű�� ����
	// GeneratedValue ������̼�
	// ����Ŭ�� ������. ������ ����� �Ӽ��� ���� ���� ���� ���ص� �ڵ����� 1�� ����.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// ����
	// �÷� ������̼� : ���̺��� �÷���� ��ġ
	// length : �÷����� ����
	@Column(length = 200)
	private String subject;
	
	// ����
	// columnDefinition ������̼� : �÷��� �Ӽ����� 
	// �Ӽ� TEXT : ���ڼ��� �����Ҽ� ���� ��쿡 ���
	// ���̺� �÷����� �ν��ϰ� ���� �ʴ� : Transient ������̼� ���
	@Column(columnDefinition = "TEXT")
	private String content; 
	
	//�ۼ��Ͻ�  
	private LocalDateTime createDate;
	
	// ������ü���� �亯 ������ ȣ���ϸ� �ȴ�.
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
