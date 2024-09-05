package application;

import java.util.Scanner;

public class Lista_08 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);

		System.out.print("Type a number for a: ");
		a = sc.nextInt();
		System.out.print("Type a number for b: ");
		b = sc.nextInt();
		System.out.print("Type a number for c: ");
		c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a);
			if (b >= c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b >= a && b >= c) {
			System.out.println(b);
		 if (a >= c) 	{
			System.out.println(a);
			System.out.println(c);
		} else {
			System.out.println(c);
			System.out.println(a);
		} 
	} else {
		System.out.println(c);
		 if (a>=b) {
			System.out.println(a);
			System.out.println(b);
		}else { 
			System.out.println(b);
			System.out.println(a);
		}
	}
	
	
	sc.close();

	}

}
