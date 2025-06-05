package Lecture4;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int input;
		do {
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			if(marks<=100 && marks>=85) {
				System.out.println("Distiction");
			}else if(marks<=84 && marks>=60) {
				System.out.println("first class");
			}else if(marks<=59 && marks>=50) {
				System.out.println("second class");
			}else if(marks<=49 && marks>=35) {
				System.out.println("third class");
			}else if(marks>100 && marks<0) {
				System.out.println("Invalid...!");
			}
			System.out.println("if you want to continue yes then 1 other wise no then 0");
			input=sc.nextInt();
		}while(input==1);
		
	}

}
