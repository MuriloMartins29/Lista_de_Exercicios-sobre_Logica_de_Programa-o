package application;

import java.util.Scanner;

public class Lista_07 {

	public static void main(String[] args) {
		
		boolean A ;
		boolean B ;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.print("input false or true for A: ");
				A = sc.nextBoolean();
				System.out.print("input false or true for B: ");
				B = sc.nextBoolean();
				
				if (A && B) {
					System.out.printf("Both are true: A is %b and B is %b\n",A ,B);
				} else if (!A && !B) {
					System.out.printf("Both are false: A is %b and B is %b\n",A ,B);
				} else {
					System.out.printf("They are different: A is %b and B is %b\n",A ,B);
				}
				
				
				sc.close();
		
		
				
	}

}
