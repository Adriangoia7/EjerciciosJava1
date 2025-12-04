package ut03.bloque6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaSiguientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("introduce un numero entero y positivo: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new ArithmeticException("el numero no es positivo");
            }

            int suma = 0;
            for (int i = n + 1; i <= n + 100; i++) {
                suma = suma + i;
            }

            System.out.println("la suma de los 100 números siguientes es: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un numero entero");
        } catch (ArithmeticException e) {
            System.out.println("Error: el numero debe ser positivo");
        }

        sc.close();
    }
}