package ut04.bloque1;

import java.util.Arrays;

public class Actividad04 {

    public static void main(String[] args) {

        int[] array1 = { 3, 7, 2, 9, 1 };
      int[] array2 = { 3, 7, 2, 9, 0 };

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("son iguales? " + Arrays.equals(array1, array2));

    }
}