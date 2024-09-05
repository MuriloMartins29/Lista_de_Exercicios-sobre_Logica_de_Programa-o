package application;

import java.util.Scanner;

public class Lista_05 {

	public static void main(String[] args) {
		double minimum_wage;
		double user_salary;
		double number_of_minimum_wages;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the minimum wage? ");
		minimum_wage = sc.nextDouble();
		System.out.print("What's the user salary? ");
		user_salary = sc.nextDouble();
		
		number_of_minimum_wages = user_salary/minimum_wage;
		
		System.out.printf("%.2f is the number of salaries",number_of_minimum_wages);
		
		
		sc.close();

	}

}
