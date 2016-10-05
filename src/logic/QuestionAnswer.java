package logic;

public class QuestionAnswer implements IQuestionAnswer {

	private String answer;
	private String question;

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if (!arg0.getClass().equals(getClass())) {
			return false;
		}

		if (((IQuestionAnswer) arg0).getAnswer().equals(getAnswer())
				&& (((IQuestionAnswer) arg0).getQuestion())
						.equals(getQuestion())) {
			return true;
		}
		
		return false;
	}

	public QuestionAnswer(String iniQuestion, String iniAnswer) {
		question = iniQuestion;
		answer = iniAnswer;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

}
