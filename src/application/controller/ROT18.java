package application.controller;

import java.util.ArrayList;

public class ROT18 implements ROTVariant{
	@Override
	public String cipherROT(String inputString) {
		StringBuilder cipheredString = new StringBuilder();
		char[] inputArray = inputString.toCharArray();
		ArrayList<Object> integerArray = new ArrayList<>();
		
		for(char num : inputArray) {
			if(Character.isDigit(num)) {
				integerArray.add(Integer.parseInt(String.valueOf(num)));
			} else if(Character.isAlphabetic(num)
					 || Character.isWhitespace(num)) {
				integerArray.add(num);
			} else {
				return "Error: ROT18/13.5 doesn't convert special characters."
					    + " Only alphabetical, integers and whitespace are "
					    + "allowed.";
			}
		}
		
		for(int count = 0; count < inputArray.length; count++) {
			if(integerArray.get(count) instanceof Character) {
				if(((Character)integerArray.get(count)).equals(' ')) {
					continue;
				} else if((Character)integerArray.get(count) > 'M'
					&& (Character)integerArray.get(count) <= 'Z' 
					|| (Character)integerArray.get(count) > 'm') {
					integerArray.set(count,
						(char)(((int)integerArray.get(count).toString().charAt(0)) - 13));
				} else if((Character)integerArray.get(count) < 'N'
					&& (Character)integerArray.get(count) <= 'Z'
					|| (Character)integerArray.get(count) < 'n') {
					integerArray.set(count,
						(char)(((int)integerArray.get(count).toString().charAt(0)) + 13));
				}
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
