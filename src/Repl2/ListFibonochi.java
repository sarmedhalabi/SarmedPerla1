package Repl2;

import java.util.LinkedList;

public class ListFibonochi {

	public static void main(String[] args) {
		LinkedList <Integer>fib=new LinkedList<>();
		int a=0;
		int b=1;
		for(int i=0; i<10;i++) {
			fib.add(a);
			int c=a+b;
			a=b;
			b=c;		
		}
		for(int num:fib) {
			
			System.out.print(num+" ");
		}
	}

}
