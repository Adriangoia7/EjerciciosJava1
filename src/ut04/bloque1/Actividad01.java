package ut04.bloque1;

import java.util.Arrays; 

public class Actividad01 {

    public static void main(String[] args) {

       int[] numeros = new int[15];  

        for (int i = 0 ; i < numeros.length ; i++ ) {

            numeros[i] = (int) (Math.random() * 100);  
        }

      System.out.println( Arrays.toString(numeros));

    }
}