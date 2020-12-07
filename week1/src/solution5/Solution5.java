package solution5;

public class Solution5 {

	public static void main(String[] args) {

		int[] arr = getRandArr();
		findOdd(arr);
		findEven(arr);

	}

	public static int[] getRandArr() {

		int[] resultArr = new int[100];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = (int) (Math.random() * 1000);
			System.out.println(resultArr[i]);
		}

		return resultArr;

	}

	public static void findOdd(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println(i + ". index is a Odd number");
			}
		}

	}

	public static void findEven(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(i + ". index is a Even number");
			}
		}

	}

}
