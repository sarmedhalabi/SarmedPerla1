package Repl1;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			int num = scan.nextInt();
			list.add(num);
		}
		System.out.println(list);
	}

}
