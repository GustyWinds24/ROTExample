package application;
import java.util.Scanner;

public class ROTMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String to convert through ROT13:");
		ROT13 cipher = new ROT13(input.next());
		
		cipher.setOutputString();
		
		System.out.printf("\nOriginal string: %s\n\nROT13 string: %s\n",
			cipher.getInputString(), cipher.getOutputString());
		
		input.close();
	}

}
