package Lecture8;

import java.util.Scanner;

public class practice1 {
	public static void evrage(int a,int b,int c) {
		int evrage=(a+b+c)/3;
		System.out.println(evrage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the thirsd number");
		int c=sc.nextInt();
		evrage(a,b,c);

	}

}
