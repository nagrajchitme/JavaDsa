package Lecture7;

import java.util.Scanner;

public class practice6 {
	public static void Even(int num) {
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Even(num);

	}

}
