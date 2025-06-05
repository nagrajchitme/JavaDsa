package Lecture7;

import java.util.Scanner;

public class practice7 {
	public static void Table(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Table(num);

	}

}
