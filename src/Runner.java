import java.util.LinkedList;

import javax.swing.JList;

import logic.IQuestionAnswer;
import logic.QuestionAnswer;


public class Runner {

	public static void main(String[] args) {
		//create 5 qa objects
		// add to a qa holder
		// create the IQA interface
		// present w/ IQA presenter that implements 
		LinkedList<IQuestionAnswer> qas = new LinkedList<IQuestionAnswer>();
		qas.add(new QuestionAnswer("WHAT IS YOUR NAME", "FREDRICK"));		
		qas.add(new QuestionAnswer("WHAT IS YOUR QUEST", "GRAIL"));
		qas.add(new QuestionAnswer("WHAT IS YOUR FAVORITE COLOR", "BLUE I MEAN RE-AHHH"));
	
		/*
		 this is getting long so "somehow" we iterate over these, passing them into the JFrameQAPresenter
		 */
	}

}
