package atm3.ex;

import java.util.Scanner;

public class Keypad {
	private Scanner input;

	public Keypad() {
		input = new Scanner(System.in);
	}

	public String getInput() {
		return input.next();
	}
	
	public int getChoice() {
		return input.nextInt();
	}
	
	public double getAmount(){
		return input.nextDouble();
	}
}
