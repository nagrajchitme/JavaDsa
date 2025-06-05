package Lecture8;

import java.util.Scanner;

public class practice5 {
	public static void eligiblity(int age) {
		if(age>18) {
			System.out.println("eligible");
		}else {
			System.out.println("Not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		eligiblity(age);

	}

}
