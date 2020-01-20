import java.math.BigInteger;
public final class BigIntegerFactorial {

  private BigIntegerFactorial() {
  }

  static BigInteger factorial(long n){
    BigInteger result = BigInteger.ONE;
    for(int i = 1; i <= n; i++) {
    	result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
  
  static int fakultaet(int n) {
	  int a = 1;
	  for(int i = 1; i <= n; i++) {
		  a = a*i;
	  }
	  return a;
  }
  
  public static void main(String[] args) {
	System.out.println(fakultaet(5));
	System.out.println(factorial(5));
  }
}