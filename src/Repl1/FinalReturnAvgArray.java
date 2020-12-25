package Repl1;

public class FinalReturnAvgArray {
	final public static double avgElements(int[] a) {
		double sum = 0;
		double totalLength = 0;
		int Length=a.length;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			totalLength = sum /Length;
		}
		return totalLength;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 3, 8, 4 };
		System.out.println(avgElements(a)); // should print 4.8
	}

}
