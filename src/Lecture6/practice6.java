package Lecture6;

import java.util.Scanner;

public class practice6 {
	public static void Table() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number");
		int a=sc.nextInt();
		for(int i=1;i<=10; i++) {
			System.out.println(a*i);
		}
	}
	public static void main(String[] args) {
		Table();
	}
}
