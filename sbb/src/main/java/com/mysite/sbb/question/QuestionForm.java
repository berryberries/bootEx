package com.mysite.sbb.question;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QuestionForm {
	
	// @NotEmpty : 빈문자열 허용 안함
	@NotEmpty(message="제목은 필수항목입니다.")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="내용은 필수항목입니다.")
	private String content;

}
