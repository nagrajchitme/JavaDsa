package Lecture2;

import java.util.Scanner;

public class problem2 {
	public static void main(String[]raj) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		double circum=2*Math.PI*radius;
		System.out.println(circum);
	}

}
