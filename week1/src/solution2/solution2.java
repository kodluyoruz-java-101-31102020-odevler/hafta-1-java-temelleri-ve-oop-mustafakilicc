package solution2;

import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {

		System.out.println("Bir iþlem seçin:");
		System.out.println("1-Toplama");
		System.out.println("2-Çýkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");

		Scanner scan = new Scanner(System.in);

		int selected = scan.nextInt();
		System.out.println("ilk Sayýyý girin");
		int num1 = scan.nextInt();
		System.out.println("Ýkinci Sayýyý girin");
		int num2 = scan.nextInt();

		switch (selected) {
		case 1:
			System.out.println("Sonuç: " + (num1 + num2));
			break;

		case 2:
			System.out.println("Sonuç: " + (num1 - num2));
			break;

		case 3:
			System.out.println("Sonuç: " + num1 * num2);
			break;
		case 4:
			System.out.println("Sonuç: " + (double) num1 / num2);
			break;

		default:
			System.out.println("Geçersiz Seçim");
			break;
		}

		scan.close();

	}
}
