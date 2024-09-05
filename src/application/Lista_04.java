package application;

import java.util.Scanner;

public class Lista_04 {

	public static void main(String[] args) {
		
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Type a number: ");
			n = sc.nextInt();
			
			System.out.printf("%d is the antecessor and %d is the sucessor ",n-1,  n+1);
			
			sc.close();
	}

}
