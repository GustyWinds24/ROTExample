package application.controller;

public enum ROTOption {

	ROT5(1),
	ROT13(2),
	ROT18(3),
	ROT47(4);
	
	private final int value;
	
	private ROTOption(int value) {
		this.value = value;
	}
	
}
