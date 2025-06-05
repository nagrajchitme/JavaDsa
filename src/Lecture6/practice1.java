package Lecture6;

import java.util.Scanner;

public class practice1 {
	void printname(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		practice1 p=new practice1();
		p.printname(a,b);
	}

}
