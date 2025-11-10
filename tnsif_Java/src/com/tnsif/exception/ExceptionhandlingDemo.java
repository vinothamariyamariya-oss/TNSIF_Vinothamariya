package com.tnsif.exception;


	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class ExceptionhandlingDemo {
		public static void main(String[]args) {
			Scanner scanner = new Scanner(System.in);
			
			try {
				System.out.print("Enter the number : ");
				int number = scanner.nextInt();
				  
				
				if(number%2==0)
					System.out.println(number+"is Even");
				else
					System.out.println(number +"is odd");
					
			} catch (InputMismatchException e) {
				System.err.println("Invalid input...");
			} finally {
				System.out.println("In Finally....");
				scanner.close();
			}
		}
	}



