package Repl;

public class Parent {
	static int sum(int[][] a) {
		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int h = 0; h < a[i].length; h++) {
//				sum = sum + a[i][h];
//			}
//		}
		for(int[] b:a) {
			for(int c:b) {
				sum=sum+c;
			}
		}
		return sum;
	}
}

//class child extends Parent {
//	public static void main(String[] args) {
//
//		int[][] i = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(Parent.sum(i));
//	}
//
//}
