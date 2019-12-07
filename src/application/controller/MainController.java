package application.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MainController implements EventHandler{

	@Override
	public void handle(Event event) {
		System.out.println("Test");
		Button button = new Button();
		if(event.getSource().equals(button)) {
			
		} else {
			
		}
	}
	
}
