// Created by Tom Seibt

class Second{

  static double monom(double a, double x, int e){
	  return a*Math.pow(x, e);   
  }

  static int signum(long x){
  	return (int) Math.signum(x);
  }

  static double flaeche(double r){
  	return Math.PI*Math.pow(r, 2);
  }

  static double umfang(double r){
  	return 2*Math.PI*r;
  }

  static double hoeheGleichschenklig(double a, double c){
  	return Math.sqrt(Math.pow(a, 2)-Math.pow((c/2), 2));
  }

  static double hypothenuse(double a, double b){
  	return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
  }

  static double hoeheRechtwinklig(double a, double b){
    double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    double p = (Math.pow(a, 2)/c);
    double q = (Math.pow(b, 2)/c);
    return Math.sqrt(p*q);
  }
}