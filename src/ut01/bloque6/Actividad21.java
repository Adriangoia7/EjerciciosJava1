package ut01.bloque6;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int ultima = numero % 10;

        System.out.println("La última cifra de " + numero + " es " + ultima);

        sc.close();
    }
}