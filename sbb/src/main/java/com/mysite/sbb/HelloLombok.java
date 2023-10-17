package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// reaueredArgsContstrutor������̼��� ����ϸ� �ش� �Ӽ��� �ʿ���ϴ�
// �����ڰ� �Һ��� ���� �ڵ����� �����ȴ�.
// final�� �����߱� ������ setter������̼��� �ǹ� ���� -> setter �ż��� ��� �Ұ�
// this����� �Ͱ� ������
@RequiredArgsConstructor

@Getter
//@Setter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("���",5);
//		helloLombok.setHello("hello");
//		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}
