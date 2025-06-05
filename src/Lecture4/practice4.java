package Lecture4;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		int number ,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	
	}

}
