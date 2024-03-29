package application.controller;

import java.util.ArrayList;

public class ROT5 implements ROTVariant {
	
	@Override
	public String cipherROT(String inputString) {
		StringBuilder cipheredString = new StringBuilder();
		char[] inputArray = inputString.toCharArray();
		ArrayList<Object> integerArray = new ArrayList<>();
		
		for(char num : inputArray) {
			if(Character.isDigit(num)) {
				integerArray.add(Integer.parseInt(String.valueOf(num)));
			} else if(Character.isWhitespace(num)) {
				integerArray.add(num);
			} else {
				return "Error: ROT5 doesn't convert characters."
					    + " Only integers and whitespace are allowed.";
			}
		}
		
		for(int count = 0; count < inputArray.length; count++) {
			if(integerArray.get(count) instanceof Character) {
				continue;
			} else if((int)integerArray.get(count) >= 5) {
				integerArray.set(count, (int)integerArray.get(count) - 5);
			} else if((int)integerArray.get(count) < 6) {
				integerArray.set(count, (int)integerArray.get(count) + 5);
			}
		}
		
		for(Object s : integerArray) {
			cipheredString.append(s.toString());
		}
		
		return cipheredString.toString();
	}
	
}
