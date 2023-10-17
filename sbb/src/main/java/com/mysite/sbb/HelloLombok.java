package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// reaueredArgsContstrutor어노테이션을 사용하면 해당 속성을 필요로하는
// 생성자가 롬복에 의해 자동으로 생성된다.
// final을 적용했기 때문에 setter어노테이션은 의미 없음 -> setter 매서드 사용 불가
// this사용한 것과 동일함
@RequiredArgsConstructor

@Getter
//@Setter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로",5);
//		helloLombok.setHello("hello");
//		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}
