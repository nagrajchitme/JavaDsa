package Lecture10;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();

		int number[]=new int[size];
		for(int i=0; i<size; i++) {
				number[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++) {
				System.out.println(number[i]);
		}
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		for(int i=0; i<number.length; i++) {
			if(number[i]<min) {
				min=number[i];
			}
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("largest number :"+max);
		System.out.println("smallest number :"+min);


	}

}
