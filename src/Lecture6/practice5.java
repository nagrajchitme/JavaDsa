package Lecture6;

import java.util.Scanner;

public class practice5 {
	
	public static void even() {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even();
	}

}
