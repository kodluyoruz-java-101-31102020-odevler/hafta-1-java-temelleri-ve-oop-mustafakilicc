package solution1;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		
		//
		String pass="myPass";
		Scanner scan=new Scanner(System.in);
		String inputPass=scan.next();
		
		if(pass.equals(inputPass)) {
			System.out.println("Giriþ Baþarýlý!");
		} else {
			System.out.println("Giriþ Baþarýsýz");
		}

		scan.close();
	}

}
