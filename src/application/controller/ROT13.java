package application.controller;

public class ROT13 implements ROTVariant {

	@Override
	public String cipherROT(String inputString) {
		String cipheredString;
		char[] inputArray = inputString.toCharArray();
		
		for(int count = 0; count < inputArray.length; count++) {
			if(inputArray[count] == ' ') {
				continue;
			} else if(Character.isDigit(inputArray[count])
				     || !Character.isAlphabetic(inputArray[count])) {
				return "Error: ROT13 doesn't convert integers nor special "
						+ "characters. Only alphabetical and whitespace "
						+ "are allowed.";
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
