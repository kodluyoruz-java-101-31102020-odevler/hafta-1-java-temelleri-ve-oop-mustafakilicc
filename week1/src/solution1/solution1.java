package solution1;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		
		//
		String pass="myPass";
		Scanner scan=new Scanner(System.in);
		String inputPass=scan.next();
		
		if(pass.equals(inputPass)) {
			System.out.println("Giri� Ba�ar�l�!");
		} else {
			System.out.println("Giri� Ba�ar�s�z");
		}

		scan.close();
	}

}
