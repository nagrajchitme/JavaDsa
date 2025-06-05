package Lecture10;

import java.util.Scanner;

public class Factorial5 {
	public static void Factorial(int num) {
		int Factorial=1;
		for(int i=1; i<=num; i++) {
			Factorial=Factorial*i;
		}
		System.out.println(Factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorial(num);
		

	}

}
