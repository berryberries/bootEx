package com.mysite.sbb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// �������͸��� ����� �Ǵ� ��ƼƼ�� Ÿ��(Question)�� 
// �ش� ��ƼƼ�� PK�� �Ӽ�Ÿ��(Integer)�� �����ؾ��Ѵ�.
public interface QuestionRepository extends JpaRepository<Question,Integer> {

	// DB�� �����ϱ� ���ؼ��� �������͸��� �ʿ���
	// ��ƼƼ�����δ� �Ұ���
	// = �׷��� ���� DB�� �����ϱ� ���� JPA�������͸��� �ʿ���
	// �������͸� : ��ƼƼ�� ���� ������ �����ͺ��̽� ���̺� �����ϴ�
	// 				�޼������ ����ϱ� ���� �������̽�
	
	Question findBySubject(String Subject);
	Question findBySubjectAndContent(String subject, String content);
	
	List<Question> findBySubjectLike(String subject);
}
