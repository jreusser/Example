package view;

import logic.IQuestionAnswer;

public interface IQAPresenter {
	void showQuestionAnswer(IQuestionAnswer iqa);
	void isQuestionAnswerCorrect(IQuestionAnswer iqa);	
}
