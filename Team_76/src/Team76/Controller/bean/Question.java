package bean;
public class Question {

	String quizId, questionId, questions, options, correctAns;

	public Question() {

	}
	

	
	public Question(String quizId, String questionId, String questions, String options, String correctAns) {
		super();
		this.quizId = quizId;
		this.questionId = questionId;
		this.questions = questions;
		this.options = options;
		this.correctAns = correctAns;
	}


	public String getQuizId() {
		return quizId;
	}

	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getCorrectAnswer() {
		return correctAns;
	}

	public void setCorrectAnswer(String correctAns) {
		this.correctAns = correctAns;
	}

	
}