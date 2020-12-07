package solution4;

public class Solution4 {

	public static void main(String[] args) {

		drawWithString();
		drawWithStringBuilder();

	}

	public static void drawWithString() {

		String stars = "";
		for (int i = 0; i < 10; i++) {

			stars += "* ";
			System.out.println(stars);

		}

	}

	public static void drawWithStringBuilder() {
		StringBuilder stars = new StringBuilder();

		for (int i = 0; i < 10; i++) {

			stars.append("* ");
			System.out.println(stars);

		}
	}

}
