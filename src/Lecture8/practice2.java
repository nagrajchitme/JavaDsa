package Lecture8;

import java.util.Scanner;

public class practice2 {
	public static void oddsum(int a){
		int count=0;
	for(int i=1; i<=a; i++) {
		if(i%2!=0) {
			count=count+i;
		}
	}
	System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		oddsum(a);
	}
}
