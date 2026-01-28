package Repaso;

import java.util.Arrays;

public class Repaso  {

  public static void main(String[] args) {
  

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    //String[] cars = new String[4];

    int[] num = new int[4];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;
    //System.out.println();

    num[2] += 7;
    //System.out.println(num[2]);

    //int num[] = {1,2,3,4};
    for (int i=0; i < 4; i++) {
      System.out.println("La posicion del array es " + cars[i]);
      
    }


  }
  
}