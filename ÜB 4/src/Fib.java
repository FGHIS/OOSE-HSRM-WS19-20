// Created by Tom Seibt

public class Fib {
	static int fib(int n) {
		if(n == 0) {
			return 0;
		} else {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return fib(n-1) + fib(n-2);
			}
		}
	}
		
	public static void main(String[] args) {
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
	}
}
