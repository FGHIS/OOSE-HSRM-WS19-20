// Created by Tom Seibt

public class FibGen {
	long fib1 = -1;
	long fib2 = 1;
  long nextFib(){
  	long output = fib1 + fib2;
  	fib1 = fib2;
  	fib2 = output;
  	return output;
  }
  
  public static void main(String[] args){
    FibGen fib = new FibGen();
    for (int i=0;i <= 10; i = i+1){
      System.out.println(fib.nextFib());
    }
  } 
}
