package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	private final static ROTOption[] options = ROTOption.values();
	
	private ROT13 rot13 = new ROT13();
	private ROT5 rot5 = new ROT5();	
	private ROT18 rot18 = new ROT18();
	private ROT47 rot47 = new ROT47();
	
	@FXML 
	private RadioButton rot5Button;
	@FXML
	private RadioButton rot13Button;
	@FXML 
	private RadioButton rot18Button;
	@FXML 
	private RadioButton rot47Button;
	@FXML
	private TextField inputTextField;
	@FXML
	private TextArea outputTextArea;
	
	private String inputText;
	private static int rotOption = 1;
	
	public void setInputText() {
		inputText = inputTextField.getText();
		ROTOption selectedROTOption = getROTOption();
		
		switch(selectedROTOption) {
			case ROT5:
				setOutputText(rot5.cipherROT(inputText));
				break;
			case ROT13:
				setOutputText(rot13.cipherROT(inputText));
				break;
			case ROT18:
				setOutputText(rot18.cipherROT(inputText));
				break;
			case ROT47:
				setOutputText(rot47.cipherROT(inputText));
				break;
		}
	}
	
	public void setOutputText(String outputText) {
		outputTextArea.setText(outputText);
	}
	
	public void rot5ButtonSelected() {
		rotOption = 1;
	}
	
	public void rot13ButtonSelected() {
		rotOption = 2;
	}

	public void rot18ButtonSelected() {
		rotOption = 3;
	}
	
	public void rot47ButtonSelected() {
		rotOption = 4;
	}
		
	private static ROTOption getROTOption() {
		return options[rotOption - 1];
	}
}
