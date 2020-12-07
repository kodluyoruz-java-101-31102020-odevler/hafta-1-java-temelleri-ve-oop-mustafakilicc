package solution3;

public class Solution3 {

	public static void main(String[] args) {

		int[] arr = getRandArr();
		double average = getAverage(arr);
		System.out.println("Average: " + average);

	}

	public static int[] getRandArr() {

		int[] resultArr = new int[10];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = (int) (Math.random() * 1000);
			System.out.println(resultArr[i]);
		}

		return resultArr;
	}

	public static double getAverage(int[] arr) {

		int sumIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			sumIndex += arr[i];
		}

		double average = (double) sumIndex / arr.length;
		return average;
	}

}
