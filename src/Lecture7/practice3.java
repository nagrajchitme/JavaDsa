package Lecture7;

import java.util.Scanner;

public class practice3 {
	public static void Factorial(int n) {
		int factorial=1;
		for(int i=1; i<=n; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Factorial(n);
		

	}

}
