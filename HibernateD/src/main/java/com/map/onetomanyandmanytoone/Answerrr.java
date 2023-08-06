package com.map.onetomanyandmanytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Answerrr {
	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;

	//Answer Many but question 1
	@ManyToOne
	private Questionnn question;

	/**
	 * 
	 */
	public Answerrr() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param answerId
	 * @param answer
	 */
	public Answerrr(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questionnn getQuestion() {
		return question;
	}

	public void setQuestion(Questionnn question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}

}
