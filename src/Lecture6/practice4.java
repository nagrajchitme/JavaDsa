package Lecture6;

import java.util.Scanner;

public class practice4 {
	public static void prime() {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int num=sc.nextInt();
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
		
	  prime();
		
	}

}
