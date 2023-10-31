package demo11;

import java.util.Scanner;

public class demo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();

	        // Check if the first number is Greater or small using the ternary operator
	        String result1 = (a >= b) ? "Greater" : "Smaller";

	        // Check if the second number is Greater or small using the ternary operator
	        String result2 = (b >= a) ? "Greater" : "Smaller";

	        System.out.println("The first number is " + result1);
	        System.out.println("The second number is " + result2);

	        scanner.close();
	    }
	}


