package Lecture10;

import java.util.Scanner;

public class Fibonacci4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=0,b=1,num=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<num; i++) {
			int next=a+b;
			System.out.println(next);
			a=b;
			b=next;
		}

		
	}

}
