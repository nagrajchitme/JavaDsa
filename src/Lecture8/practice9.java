package Lecture8;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int result=1;
		for(int i=1; i<n; i++) {
			result=result*x;
		}
		
		System.out.println(result);
	}

}
