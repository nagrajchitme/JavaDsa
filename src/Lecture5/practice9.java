package Lecture5;

public class practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++) {
				System.out.print(" *");
			}System.out.println(" ");
		}
	}

}
