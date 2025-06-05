package Lecture13;

import java.util.Scanner;

public class practice2 {
	public static void factorial(int num) {
		
		int a=0, b=1;  
		System.out.println(a+"\n"+b);
		for(int i=1; i<=num; i++) {
			int temp=a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
		}
	}
	public static void sorting(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr= {1,9,3,7,5};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int num=sc.nextInt();
		factorial(num);
		System.out.println();
		sorting(arr);
	}

}
