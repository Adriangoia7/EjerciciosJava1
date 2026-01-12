package ut04.bloque1;

import java.util.Arrays;

public class Actividad06 {

    public static void main(String[] args) {

    int[] original = new int[15];

        for (int i = 0 ; i < original.length ; i++ ) {
           original[i] = (int) (Math.random() * 100);
        }
        int[] copia = Arrays.copyOf(original, original.length);

        System.out.println("array original: " + Arrays.toString(original));
        System.out.println("copia exacta:   " + Arrays.toString(copia));
    }
}