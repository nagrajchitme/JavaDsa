package Lecture3;

import java.util.Scanner;

public class month2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("days :1");
		System.out.println("months :2");
		a=sc.nextInt();
		switch(a) {
		case 1:{
			System.out.println("Enter day number");
			b=sc.nextInt();
			switch(b) {
			case 1:{
				System.out.println("Monday");
				break;
			}
			case 2:{
				System.out.println("Tuesday");
				break;
			}
			case 3:{
				System.out.println("Wednesday");
				break;
			}
			case 4:{
				System.out.println("Thursday");
				break;
			}
			case 5:{
				System.out.println("Friday");
				break;
			}
			case 6:{
				System.out.println("Saturday");
				break;
			}
			case 7:{
				System.out.println("Sunday");
				break;
			}
			default :{
				System.out.println("Invalid choice..!");
			}
			
			}break;
		}
		case 2:{
			System.out.println("Enter month number");
			c=sc.nextInt();
			switch(c) {
			case 1:{
				System.out.println("January");
				break;
			}
			case 2:{
				System.out.println("February");
				break;
			}
			case 3:{
				System.out.println("March");
				break;
			}
			case 4:{
				System.out.println("April");
				break;
			}
			case 5:{
				System.out.println("May");
				break;
			}
			case 6:{
				System.out.println("June");
				break;
			}
			case 7:{
				System.out.println("July");
				break;
			}
			case 8:{
				System.out.println("August");
				break;
			}
			case 9:{
				System.out.println("September");
				break;
			}
			case 10:{
				System.out.println("October");
				break;
			}
			case 11:{
				System.out.println("November");
				break;
			}
			case 12:{
				System.out.println("December");
				break;
			}
			default :{
				System.out.println("Invali choice...!");
			}
			
			}
			
		}break;
		case 3:{
			System.out.println("Invali choice...!");
		}
		}
		
		

	}

}
