package ut04.bloque1;

import java.util.Arrays;

public class Actividad07 {

    public static void main(String[] args) {

        int[] original = new int[15];

        for (int i = 0 ; i < original.length ; i++ ) {
         original[i] = (int) (Math.random() * 100);
        }
    int[] copia10 = Arrays.copyOfRange(original, 0, 10);

        System.out.println("array original: " + Arrays.toString(original));
        System.out.println("copia 10 primeros:" + Arrays.toString(copia10));
    }
}