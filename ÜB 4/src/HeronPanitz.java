class HeronPanitz{
  static double sqrt(double x) {
    assert x>=0;
    return sqrt(x, (x +1) / 2) ;
  }
  static double sqrt(double x, double approx) {
    while (approx*approx-x > 0.00001){
      approx = ((Math.pow(approx, 2) + x) / (2 * approx));
    }
    return approx;  
  }
}