package Lecture7;

import java.util.Scanner;

public class practice1 {
	public static void Avrage(double a, double b, double c ) {
		double d;
		d=(a+b+c)/3;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers");
		double a,b,c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		Avrage(a,b,c);
	}

}
