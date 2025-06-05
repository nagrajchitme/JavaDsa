package Lecture6;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		double a,b;
		a=sc.nextDouble();
		b=sc.nextDouble();
		multiply(a,b);
	}
	public static void multiply(double a ,double b) {
		
		System.out.println(a*b);
		return ;
	}
	

}
