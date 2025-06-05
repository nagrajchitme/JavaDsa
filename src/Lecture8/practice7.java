package Lecture8;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int positive=0; int negative=0; int zero=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for continue 0 for stop");
		int input=sc.nextInt();
		while(input==1) {
			System.out.println("enter the number");
			int number=sc.nextInt();
			if(number>0) {
				positive++;
			}else if(number<0) {
				negative++;
			}else {
				zero++;
			}
			System.out.println("Enter 1 for continue 0 for stop");
			 input=sc.nextInt();
		}
		System.out.println("positive :"+positive);
		System.out.println("negative :"+negative);
		System.out.println("zero :"+zero);
		}
	}


