package ut03.bloque2;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = (int)(Math.random() * 100) + 1;
        int intentos = 0;
        int maxIntentos = 10;

        System.out.println("Adivina el número entre 1 y 100. Tienes 10 intentos.");

        while (intentos < maxIntentos) {
            System.out.println("Introduce tu número:");
            int n = scanner.nextInt();
            intentos = intentos + 1;

            if (n == X) {
                System.out.println("¡Has adivinado el niumero!");
                break;
            } else if (n < X) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Lo siento, has perdido. El número era: " + X);
        }

        scanner.close();
    }
}