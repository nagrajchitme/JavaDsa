package Lecture8;

import java.util.Scanner;

public class practice4 {
	public static void Radius(double radius) {
		double c;
		c=2*Math.PI*radius;
		System.out.println(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		Radius(radius);

	}

}
