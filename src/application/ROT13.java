package application;

public class ROT13 implements ROTVariant {
	private String inputString;
	private String outputString;
	
	public ROT13(String inputString) {
		this.inputString = inputString;
	}
	
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	public String getInputString() {
		return inputString;
	}
	
	public void setOutputString() {
		outputString = cipherROT(inputString);
	}
	
	public String getOutputString() {
		return outputString;
	}
	
	@Override
	public String cipherROT(String inputString) {
		String cipheredString;
		char[] inputArray = inputString.toCharArray();
		
		for(int count = 0; count < inputArray.length; count++) {
			if(inputArray[count] == ' ') {
				continue;
			} else if(inputArray[count] > 'M' && inputArray[count] <= 'Z' 
				|| inputArray[count] > 'm') {
				inputArray[count] -= 13;
			} else if(inputArray[count] < 'N' && inputArray[count] <= 'Z'
				|| inputArray[count] < 'n') {
				inputArray[count] += 13;
			}
		}
		
		cipheredString = String.valueOf(inputArray);
		
		return cipheredString;
	}
}
