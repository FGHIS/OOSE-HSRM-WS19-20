// Created by Tom Seibt

public final class MoreSimpleArrayFuns {

  private MoreSimpleArrayFuns() {
  }

  // Index = Position im Array 
  public static int firstIndex(int[] xs,int y){
  	if(contains(xs,y)) {
  		int a = 0;
  		for (int i=0;i<xs.length;i=i+1) {
  			if(xs[i]==y) {
  				a = i;
  			}
  		}return a;
  	}
    return -1;
  }
  
  // Hilfsmethode 
  static boolean contains(int[] xs,int y){
  	boolean result = false;
  	for (int i=0;i<xs.length;i=i+1) {
  		if (xs[i] == y) {
  		  result = true;
  		}
  	}
    return result;
  }
  
  static boolean startsWith(int[] prefix, int[] xs){
  	if(prefix.length>xs.length) {
  		return false;
  	}
  	boolean output = false;
  	for (int i=0; i<prefix.length;i++) {
  		output = prefix[i] == xs[i];
  	}
  	return output;
  }
  
  // ersetzen vom Element oldI durch newI
  // dazu das alte Element finden + Index
  // mit dem Index das neue Element einfügen
  public static void replace(int[] xs, int oldI, int newI){
  	if(!contains(xs,oldI)) {
  		System.out.println("----------- Wert nicht im Array "
  				+ "enthalten ---------------");
  	}
  	int a = firstIndex(xs, oldI);
  	xs[a] = newI;
  }
  
  // Hilfsmethode
  public static String toString(int[] xs) {
  	String a = "";
  	for (int i=0;i<xs.length;i=i+1) {
  		a = a + xs[i];
  	}
  	return a;
  }
  
  // Herleitung der Lösung auf IPad !
  // -> ? i<xs.length/2 auch Erklärung warum /2 und nicht -2
  static void reverse(int[] xs){
  	int temp;
  	for (int i=0; i<xs.length/2; i++) {
  		temp = xs[i];
  		xs[i] = xs[(xs.length - 1-i)];
  		xs[(xs.length - 1-i)] = temp;
  	}
  }

  
  static int[] getSubArray(int[] xs, int startIndex, int length){
  	int[] neu = new int[length];
  	for(int i=startIndex; i<xs.length-1; i++) {
  		neu[i] = xs[i];
  	}
    return neu;
  }
  
  public static void main(String[] args) {
  	int[] aa = {1,2,3,4,5,6,7,8};
  	int[] bb = {1,2,3,4,5,6};
  	int[] cc = {1,2,3};
  	int[] dd = {1,2,3,4,5,6,7,8,9};
  	System.out.println(getSubArray(aa,3,8));
  	System.out.println(firstIndex(aa,4));
	System.out.println(firstIndex(bb,7));
	System.out.println(startsWith(cc,dd));
	System.out.println(startsWith(dd,aa));
	replace(aa,9,3);
	replace(aa,1,4);
	System.out.println(toString(aa));
	reverse(cc);
	System.out.println(toString(cc));
	reverse(aa);
	System.out.println(toString(aa));
	reverse(dd);
	System.out.println(toString(dd));
	}
}
