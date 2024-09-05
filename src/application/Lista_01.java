package application;

import java.util.Scanner;

public class Lista_01 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para A: ");
		A = sc.nextInt();
		System.out.println("Digite um número para B: ");
		B = sc.nextInt();
		System.out.println("Digite um número para C: ");
		C  = sc.nextInt();
		
		System.out.printf("O valor de A + B é: %d%n",A + B);
		
		if (A + B < C)  {
			System.out.println("É menor");
			
		}
		else 
			System.out.println("É maior");
				
		
		sc.close();
		
				
		
	}

}
