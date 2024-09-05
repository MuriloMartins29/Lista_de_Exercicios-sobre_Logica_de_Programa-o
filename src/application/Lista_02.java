package application;

import java.util.Scanner;

public class Lista_02 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("The number is even");
		} else { 
			System.out.println("The number is odd");
		}
		
		
		if (a < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is positive or zero");
		}
		
		
		
		sc.close();

	}

}
