package Lecture5;

public class practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=4; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
