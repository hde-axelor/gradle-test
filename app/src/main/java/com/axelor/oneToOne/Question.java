package com.axelor.oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "Questions")
	private int question_id;
	private String question;
	
	@OneToOne
	private Answers answer;

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers getAnswers() {
		return answer;
	}

	public void setAnswer(Answers answer) {
		this.answer = answer;
	}

	 
}
