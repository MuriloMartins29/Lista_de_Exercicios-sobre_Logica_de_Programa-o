package application;

import java.util.Scanner;

public class Lista_06 {

	public static void main(String[] args) {
		
		double original_value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number to reajusted by 5%: ");
		original_value = sc.nextDouble();
		
		double adjusted_value = original_value * 1.05;
		
		System.out.printf("the reajusted value is: %.2f",adjusted_value);
		
		sc.close();

	}

}
