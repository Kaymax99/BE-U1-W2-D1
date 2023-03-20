package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runnable {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = new int[5];
		randomToIndex(numArray, 0);
		randomToIndex(numArray, 1);
		randomToIndex(numArray, 2);
		randomToIndex(numArray, 3);
		randomToIndex(numArray, 4);
		
		int input = 1;
		do {
			System.out.println("Current array:");
			System.out.println(Arrays.toString(numArray));
			int x = randomNum();
			
			System.out.println("Here's a random number: " + x);
			System.out.println("Where would you like to insert this number?");
			input = scanner.nextInt();
			
			
			switch (input) {
			case 0: {System.out.println("See you next time!");
			break;
				}
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: {
				pushToIndex(numArray, input-1, x);
				break;
				}
			default: {
					try {
						pushToIndex(numArray, input-1, x);
					} catch(ArrayIndexOutOfBoundsException ex) {
						System.out.println(input + " is not an acceptable position!");
						System.out.println("Please insert a number between 1-5, or insert 0 to quit");
					}
				}
			}
		} while (input != 0);
		
	}
	
	private static int randomNum() {
		Random rand = new Random();
		int num = rand.nextInt((10 - 1) + 1) + 1;
		return num;
	}
	
	private static int[] randomToIndex(int[] array, int num) {
		int ranNum = randomNum();
		array[num] = ranNum;
		return array;
	}
	
	private static void pushToIndex(int[] array, int a, int b) {
		array[a] = b;
	}
	
//	private static

}
