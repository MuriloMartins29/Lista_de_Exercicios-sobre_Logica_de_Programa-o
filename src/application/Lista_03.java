package application;

import java.util.Scanner;

public class Lista_03 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		
		Scanner sc = new Scanner(System.in);
		
				System.out.println("Type a number for A: ");
				A = sc.nextInt();
				System.out.println("Type a number for B: ");
				B = sc.nextInt();
				
				
				if (A == B) {
					C = A + B;
				} else {
					C = A * B;
				}
				System.out.printf("The value of C is: %d%n", C);
				
				sc.close();

	}

}
