package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runnable {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kms;
		int lts;
		try {
			System.out.println("Insert KMs");
			kms = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Insert the liters of fuel consumed");
			lts = scanner.nextInt();
			scanner.nextLine();		
			try {
				double consumption = calculateCons(kms,lts);
				System.out.println("the consumption is: " + consumption + " km/l");
			}
			catch(ArithmeticException ex) {
				System.out.println("You have entered an impossible division!");
			}
		} catch(InputMismatchException e) {
			System.out.println("You've entered an invalid number! Please insert values as integers");
		}
	}
	
	private static double calculateCons(int k, int f) {
		double cons = k / f;
		return cons;
		
	}

}
