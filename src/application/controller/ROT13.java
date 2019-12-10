package application.controller;

public class ROT13 implements ROTVariant {

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
