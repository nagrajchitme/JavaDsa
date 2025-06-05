package Lecture8;

import java.util.Scanner;

public class practice3 {
	public static void grater(int a , int b) {
		if(a>b) {
			System.out.println(a+" is grater then "+b);
		}else {
			System.out.println(b+" is grater then "+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		grater(a,b);
	}

}
