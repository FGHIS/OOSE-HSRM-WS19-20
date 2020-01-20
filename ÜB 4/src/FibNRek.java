// Created by Tom Seibt

public class FibNRek {
	static long fib(int n) {
		double a = Math.pow(((1+Math.sqrt(5))/2), n);
		double b = Math.pow(((1-Math.sqrt(5))/2), n);
		double c = Math.sqrt(5);
		double output = ((a-b)/c);
		return (long) output;
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
