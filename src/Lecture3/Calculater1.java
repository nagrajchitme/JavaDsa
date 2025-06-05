package Lecture3;

import java.util.Scanner;

public class Calculater1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double a , b ;
		System.out.print("Enter first number :");
		a=sc.nextDouble();
		System.out.print("Enter second number  :");
		b=sc.nextDouble();
		System.out.println("Addition :1");
		System.out.println("Subtraction :2");
		System.out.println("Multiplication :3");
		System.out.println("Division :4");
		System.out.println("Modulo or remainder :5");
		int c=sc.nextInt();
		 switch(c) {
		 case 1:{
			 System.out.println(a+b);
			 break;
		 }
		 case 2:{
			 System.out.println(a-b);
			 break;
		 }
		 case 3:{
			 System.out.println(a*b);
			 break;
		 }
		 case 4:{
			 System.out.println(a/b);
			 break;
		 }
		 case 5:{
			 System.out.println(a+b);
			 break;
		 }
		 default:{
			 System.out.println("Invalid choice..!");
		 }
		 
		 }

		
	}

}
