// Created by Tom Seibt

class First{
  static int fortyTwo(){
    return 42;
  }
  static boolean isFortyTwo(int i){
    return i == 42;
  }
  static int twice(int i){
    return i*2;
  }
  static boolean isOdd(int i){
    return !(i % 2 == 0);
  }
  static int century(int i){
    return i / 100;
  }
  static int lastTwoDigits(int i){
    return i % 100;
  }
  static double arithmeticMean(int x, int y){
    return (x+y)/2.0;
  }
}

