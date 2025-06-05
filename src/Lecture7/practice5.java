package Lecture7;

import java.util.Scanner;

public class practice5 {
	public static void Prime(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}	
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Prime(num);
		

	}

}
