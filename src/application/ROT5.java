package application;

public class ROT5 implements ROTVariant {
	@Override
	public String cipherROT(String inputString) {
		String cipheredString;
		char[] inputArray = inputString.toCharArray();
		
		for(int count = 0; count < inputArray.length; count++) {
			if(inputArray[count] == ' ') {
				continue;
			} else if(inputArray[count] > 5) {
				inputArray[count] -= 5;
			} else if(inputArray[count] < 6) {
				inputArray[count] += 5;
			}
		}
		
		cipheredString = String.valueOf(inputArray);
		
		return cipheredString;
	}
}
