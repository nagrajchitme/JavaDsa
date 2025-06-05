package Lecture10;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		int[] number=new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter "+i+" number :");
			number[i]=sc.nextInt();
		}
		for(int i=0; i<number.length; i++) {
			System.out.println("list of numbers "+i+" is "+number[i]);
		}
		

	}

}
