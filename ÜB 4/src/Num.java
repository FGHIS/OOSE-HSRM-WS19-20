import java.util.ArrayList;
import java.util.Collections;

// Created by Tom Seibt

class Num{
  //n is assumed to be a positive number
  long n;
  Num(long n){
    assert n>=0;
    this.n = n;
  }
  
  String toBin(){
    // (1) Zahl Modulo 2
  	// (2) Der Rest = nächste Ziffer von links nach rechts
  	// (3) solange bis Quotient = 0, ansonsten solange den 
  	//		 ganzzahligen Quotienten als neue Zahl
  	// (4) Dazu benötige ich eine Liste die eine unbest. Anzahl 
  	//		 an Elementen speichern kann
  	// (5) Die Ausgabe der Liste erfolgt nicht in der gewünschten 
  	//		 Formattierung und muss desshalb noch mit .replace 
  	// 		 angepasst werden (Quelle (.replace)):
  	// 		 https://im-coder.com/ausgabe-arraylist-zu-string-ohne-
  	//		 eckigen-klammern-erscheinen.html
  	ArrayList<String> ausgabe = new ArrayList<>();
  	while(n > 0) {
  		String b = "" + n%2;
  		ausgabe.add(b);
  		n = n/2;
  	}
  	ausgabe.add("0");
  	Collections.reverse(ausgabe);
    return ausgabe.toString().replace("[", "").replace("]", "")
    		.replace(", ", "");
  }
  
  String toOct(){
  	ArrayList<String> ausgabe2 = new ArrayList<>();
  	while(n > 0) {
  		String b1 = "" + n%8;
  		ausgabe2.add(b1);
  		n = n/8;
  	}
  	ausgabe2.add("0");
  	Collections.reverse(ausgabe2);
    return ausgabe2.toString().replace("[", "").replace("]", "")
    		.replace(", ", "");
  }
  

	String toBase(int b){
		ArrayList<String> ausgabe3 = new ArrayList<>();
		while((n%b)>9) {
			String x = "" + getDigit(n%b);
			ausgabe3.add(x);
			n = n/b;
		}
		while(n > 0) {
			String b2 = "" + n%b;
			ausgabe3.add(b2);
			n = n/b;
		}
		ausgabe3.add("0");
  	Collections.reverse(ausgabe3);
    return ausgabe3.toString().replace("[", "").replace("]", "")
    		.replace(", ", "");
  }
			
  static char getDigit(long d){
    return (char) (d<10? '0'+d : 'A'+d-10);
  }  
  
  public static void main(String[] args) {
  	Num n1 = new Num(2);
		System.out.println(n1.toBin());
		Num n2 = new Num(22);
		System.out.println(n2.toBin());
		Num n3 = new Num(58);
		System.out.println(n3.toBin());
		Num n4 = new Num(1003);
		System.out.println("///////////////////////////////////");
		Num n5 = new Num(2);
		System.out.println(n5.toOct());
		Num n6 = new Num(42);
		Num n19 = new Num (88);
		System.out.println(n19.toOct());
		Num n7 = new Num(58);
		System.out.println(n6.toOct());
		// Learning -> Objekte die schon verwendet wurden, haben 
		// nicht mehr den geg. Wert, sondern den durch die Funkt.
		// neu zugewiesenen
		System.out.println(n7.toOct());
		System.out.println(n4.toOct());
		System.out.println("///////////////////////////////////");
		Num n8 = new Num(5);
		System.out.println(n8.toBase(5));
		Num n9 = new Num(42);
		System.out.println(n9.toBase(8));
		Num n10 = new Num(42);
		System.out.println(n10.toBase(16));
		System.out.println(getDigit(10));
		//System.out.println(Long.toBinaryString(22));
	}
}
