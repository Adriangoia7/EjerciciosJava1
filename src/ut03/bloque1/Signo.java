package ut03.bloque1;

import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Escribe un número:");
            n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Es positivo");
            } else if (n < 0) {
                System.out.println("Es negativo");
            }
        } while (n != 0);

        System.out.println("Programa terminado");
        scanner.close();
    }
}