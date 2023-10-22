package com.mysite.sbb.question;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//DataNotFoundException�� �߻��ϸ� @ResponseStatus �ֳ����̼ǿ� ���� 
//404 ����(HttpStatus.NOT_FOUND)�� ��Ÿ�� ���̴�.
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not fount")
public class DataNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
