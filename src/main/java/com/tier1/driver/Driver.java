package com.tier1.driver;

public class Driver {
  
  static int[] integerArray = new int[] {1,4,6,7,4};
  
  public static void main(String[] args) {
   System.out.println(sumArray(integerArray));
  }
  
  
  public static int sumArray(int[] array) {
    int sum = 0;
    for(int value : array) {
      sum +=value;
    }
    return sum;
  }

}
