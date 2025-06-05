package Lecture10;

import java.util.Scanner;

public class prime5 {
	public static void Prime(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Prime(num);

	}

}
