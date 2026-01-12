package ut04.bloque1;

import java.util.Arrays;

public class Actividad02 {

    public static void main(String[] args) {

        int[] numeros = new int[15];

        for (int i = 0 ; i < numeros.length ; i++ ) {
         numeros[i] = (int) (Math.random() * 100);
        }

        System.out.println("enteros sin ordenar: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("enteros ordenados: " + Arrays.toString(numeros));

        double[] doubles = new double[15];

        for (int i = 0 ; i < doubles.length ; i++ ) {
         doubles[i] = Math.random() * 100;
        }

        System.out.println("\ndoubles sin ordenar: " + Arrays.toString(doubles));
        Arrays.sort(doubles);
        System.out.println("doubles ordenados:    " + Arrays.toString(doubles));

        String[] palabras = {
            "pera", "manzana", "uva", "fresa", "melon",
       "kiwi", "naranja", "limon", "sandia", "platano",
    "cereza", "mango", "higo", "ciruela", "pomelo"
        };

      System.out.println("\nstrings sin ordenar: " + Arrays.toString(palabras));
     Arrays.sort(palabras);
       System.out.println("strings ordenados:" + Arrays.toString(palabras));

    }
}
