package com.spring.mvc.xcx.vo;

/**
 * ´ð°¸
 */
public class Answer {
	
	private Integer id;
	private String answer;
	private String answerType;
	private Boolean resultFlag = false;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerType() {
		return answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}
	public Boolean getResultFlag() {
		return resultFlag;
	}
	public void setResultFlag(Boolean resultFlag) {
		this.resultFlag = resultFlag;
	}
	
}
