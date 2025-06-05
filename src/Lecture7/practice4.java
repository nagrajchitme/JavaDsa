package Lecture7;

import java.util.Scanner;

public class practice4 {
	public static void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(a,b);

	}

}
