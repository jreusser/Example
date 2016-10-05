package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import logic.IQuestionAnswer;

public class JFrameQAPresenter implements IQAPresenter  {

private JTextArea presentQuestionAnswerArea;
	private JFrame frame;
	private IQuestionAnswer currentQuestionAnswer;
	/*
	 * Let's get this show going. 
	 */
	public void show(){
		frame = new JFrame();
		presentQuestionAnswerArea=new JTextArea();
		frame.getContentPane().add(presentQuestionAnswerArea);
		
		frame.setVisible(true);		
	}
	/*
	 * Close the JFrameQAPresenter
	 */
	public void close(){
		frame.setVisible(false);
		frame.dispose();
	}
	@Override
	public void showQuestionAnswer(IQuestionAnswer iqa) {
		presentQuestionAnswerArea.setText("Question: "+iqa.getQuestion());
		currentQuestionAnswer = iqa;
	}

	@Override
	public void isQuestionAnswerCorrect(IQuestionAnswer iqa) {
		if(iqa.equals(currentQuestionAnswer)){
			frame.getContentPane().setBackground(Color.green);
		}else{
			frame.getContentPane().setBackground(Color.red);
		}
	}

}
