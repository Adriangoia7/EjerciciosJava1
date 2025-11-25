package ut03.bloque2;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int combinacion = (int)(Math.random() * 9000) + 1000;
        int intentos = 0;
        boolean abierta = false;

        while (intentos < 4) {
            System.out.println("Introduce la combinación de 4 cifras:");
            int intento = scanner.nextInt();

            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                abierta = true;
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }

            intentos = intentos + 1;
        }

        if (!abierta) {
            System.out.println("No has conseguido abrir la caja fuerte. La combinación era: " + combinacion);
        }

        scanner.close();
    }
}