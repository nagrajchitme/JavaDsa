package Lecture8;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println(a+"");
		if(n>1) {
			for(int i=2; i<=n; i++) {
	               System.out.print(b+" ");
	               int temp = b;
	               b = a + b;
	               a = temp;
			}
			System.out.println();
		}

	}

}
