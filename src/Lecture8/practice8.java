package Lecture8;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.out.println("Enter x");
	       Scanner sc = new Scanner(System.in);
	       int x = sc.nextInt();
	       System.out.println("Enter n");
	       int n = sc.nextInt();


	       int result = 1;
	       //Please see that n is not too large or else result will exceed the size of int
	       for(int i=0; i<n; i++) {
	           result = result * x;
	       }


	       System.out.println("x to the power n is : "+ result);

	}

}
