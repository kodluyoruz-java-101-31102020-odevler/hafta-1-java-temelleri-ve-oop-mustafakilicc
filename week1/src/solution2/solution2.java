package solution2;

import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {

		System.out.println("Bir i�lem se�in:");
		System.out.println("1-Toplama");
		System.out.println("2-��karma");
		System.out.println("3-�arpma");
		System.out.println("4-B�lme");

		Scanner scan = new Scanner(System.in);

		int selected = scan.nextInt();
		System.out.println("ilk Say�y� girin");
		int num1 = scan.nextInt();
		System.out.println("�kinci Say�y� girin");
		int num2 = scan.nextInt();

		switch (selected) {
		case 1:
			System.out.println("Sonu�: " + (num1 + num2));
			break;

		case 2:
			System.out.println("Sonu�: " + (num1 - num2));
			break;

		case 3:
			System.out.println("Sonu�: " + num1 * num2);
			break;
		case 4:
			System.out.println("Sonu�: " + (double) num1 / num2);
			break;

		default:
			System.out.println("Ge�ersiz Se�im");
			break;
		}

		scan.close();

	}
}
