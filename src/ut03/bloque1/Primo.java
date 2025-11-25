package ut03.bloque1;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número:");
        int n = scanner.nextInt();
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < n; i = i + 1) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + n + " es primo.");
        } else {
            System.out.println("El número " + n + " NO es primo.");
        }

        scanner.close();
    }
}
