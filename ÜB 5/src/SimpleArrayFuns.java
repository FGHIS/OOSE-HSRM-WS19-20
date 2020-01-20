/*
 * SimpleArrayFuns
 *
 *
Schreiben Sie folgende einfache statische Methoden für Reihungen von int-Zahlen:

    static boolean contains(int[] xs,int y)
    Es soll genau dann wahr sein, wenn das Element y in xs enthalten ist.
   
    static long sum(int[] xs)
    Es soll die Summe der Zahlen in der Reihung berechnet werden.
   
    static int avg(int[] xs)
    Es soll der Durchschnitt der Zahlen berechnet werden. Für eine leere Reihung sei dieser 0.
   
    static boolean isSorted(int[] xs)
    Es soll geprüft werden, ob die Elemente in aufsteigender Reihenfolge in der Reihung stehen.
   
    static int max(int[] xs)
    Es soll das größte Element berechnet werden. Für eine leere Reihung sei dieses die kleinstmögliche int-Zahl.
   
 */



// WICHTIG -> Zeilenlängen noch beachten!!!

// Created by Tom Seibt
public final class SimpleArrayFuns {

  private SimpleArrayFuns() {
  }

  // Schleife über alle Stellen im Array die prüft
  // ob das Array den übergebenen Integer (y) enthält 
  // Dazu wird jeder Position im Array "befragt"
  // sobald es eine Übereinstimmung gibt liefert 
  // die Methode "true" zurück
  static boolean contains(int[] xs,int y){
  	boolean result = false;
  	for (int i=0;i<xs.length;i=i+1) {
  		if (xs[i] == y) {
  		  result = true;
  		}
  	}
    return result;
  }
 
 
  static long sum(int[] xs){
  	long x = 0;
  	for(int i=0;i<xs.length;i=i+1) {
  		x = x + xs[i];
  	}
    return x;
  }
  static int avg(int[] xs){
  	if(xs.length == 0) {
  		return 0;
  	}
  	return (int) (sum(xs) / xs.length);
  }
  	
  static boolean isSorted(int[] xs){
    for(int i=1; i<xs.length; i++) {
    	if(xs[i] < xs[i-1]) {
    		return false;
    	}
  	}
    return true;
  }
  
  static int max(int[] xs){
  	int output = -2147483648;
  	if(sum(xs)==0) {
  		return output;
  	} else {
  		if(isSorted(xs)) {
  			return xs[xs.length-1];
  		} else {
  			int sol = -2147483648;
  			for(int i=0; i<xs.length; i=i+1) {
  				if(xs[i]>sol) {
  					sol = xs[i];
  				}
  			} return sol;
  		}
  	}
  }
 
  public static void main(String[] args) {
  	int[] xs = {1,2,3,4,5};
  	int y = 2;
  	int[] ys = {0,0};
  	int[] zs = {0,0,1,2,3};
  	int[] ds = {1,4,6,3,1};
  	int[] as = {0,2,-1,-2,3};
  	int[] dd = {};
  	int[] aa = {1,-6,4,3,-16};
  	System.out.println(contains(xs,y));
  	System.out.println(xs[1]==y); // zur Überprüfung
  	// ob (==) geht oder equals verwendet werden muss
  	System.out.println(sum(xs));
  	System.out.println(avg(ys));
  	System.out.println(xs.length);
  	System.out.println(ys.length);
  	System.out.println(avg(zs));
  	System.out.println(isSorted(xs));
  	System.out.println(isSorted(ys));
  	System.out.println(max(xs));
  	System.out.println(max(ys));
  	System.out.println(max(ds));
  	System.out.println(avg(xs));
  	System.out.println(avg(as));
  	System.out.println(isSorted(ys));
  	System.out.println(dd.length);
  	System.out.println(isSorted(dd));
  	System.out.println(avg(aa));
  }
}
