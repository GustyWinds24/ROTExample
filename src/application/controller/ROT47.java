package application.controller;

public class ROT47 implements ROTVariant{
	
	@Override
	public String cipherROT(String inputString) {
		String cipheredString;
		char[] inputArray = inputString.toCharArray();
		
		for(int count = 0; count < inputArray.length; count++) {
			if(Character.isWhitespace(inputArray[count])) {
				continue;
			} else if(inputArray[count] > 'O' && inputArray[count] <= '~') {
				inputArray[count] -= 47;
			} else if(inputArray[count] < 'P' && inputArray[count] <= '~') {
				inputArray[count] += 47;
			}
		}
		
		cipheredString = String.valueOf(inputArray);
		
		return cipheredString;
	}
	
}
