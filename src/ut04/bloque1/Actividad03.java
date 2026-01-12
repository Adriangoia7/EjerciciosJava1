package ut04.bloque1;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0 ; i < numeros.length ; i++ ) {
          numeros[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("array sin ordenar: " + Arrays.toString(numeros));
        
        Arrays.sort(numeros);
        
        System.out.println("array ordenado: " + Arrays.toString(numeros));

        System.out.print("dime un número: ");
        int numero = teclado.nextInt();

        int posicion = Arrays.binarySearch(numeros, numero);

        if (posicion >= 0) {
            System.out.println("Si está en el array, en la posición " + posicion);
        } else {
            System.out.println("No esta en el array");
        }

        teclado.close();

    }
}