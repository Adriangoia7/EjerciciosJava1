package ut04.inicial;

import java.util.Scanner;

public class Actividad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];
        int digito, contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 300) + 1;
        }

        System.out.println("Pon un digito del 0 al 9: ");
            digito = sc.nextInt();

        for (int num : numeros) {
            if (num % 10 == digito) {
                contador++;
            }
        }

            int[] solucion = new int[contador];
                 int j = 0;
            for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] % 10 == digito) {
                solucion[j] = numeros[i];
                j++;
            }
        }

        System.out.print("Numeros que terminan en " + digito + ": ");
        for (int sol : solucion) {
            System.out.print(sol + " ");
        }
        System.out.println();
    }
}