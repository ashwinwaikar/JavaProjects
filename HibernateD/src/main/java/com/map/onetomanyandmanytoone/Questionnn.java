package com.map.onetomanyandmanytoone;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Questionnn {
	@Id
	@Column(name = "question_id")
	private int questionId;
	private String question;

	// 1 question has Many answers
	@OneToMany(mappedBy = "question")
	private List<Answerrr> answers;

	public Questionnn() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param questionId
	 * @param question
	 * @param answers
	 */
	public Questionnn(int questionId, String question, List<Answerrr> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answerrr> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answerrr> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questionnn [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}

}
