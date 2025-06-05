package Lecture10;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array :");
		int size=sc.nextInt();
		String []name=new String[size];
		for(int i=0; i<size; i++) {
			name[i]=sc.nextLine();
		}
		for(int i=0; i<name.length; i++) {
			System.out.println("name " + i +" is : " +name[i]);
		}

	}

}
