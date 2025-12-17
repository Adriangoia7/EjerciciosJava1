package ut04.inicial;

import java.util.Scanner;

public class Actividad04 {
        public static void main(String[] args) {

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1; 
        }

        Scanner sc = new Scanner(System.in);
        boolean acertado = false;

        while (!acertado) { 
            System.out.print("Introduce un número (1-50): ");
            int num = sc.nextInt();

        boolean encontrado = false;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == num) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("¡Has acertado! El número está en el array.");
                acertado = true;
            } else {
                System.out.println("No está en el array. Inténtalo de nuevo.");
            }
        }

        sc.close();
    }
    

}