package ut03.bloque5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaTope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        try {
            while (suma <= 10000) {
                System.out.print("introduce un número: ");
                double num = sc.nextDouble();  

                suma += num;
                contador++;
            }

            if (contador == 0) {
                System.out.println("no se han introducido ningún números.");
            } else {
                double media = suma / contador;  
                System.out.println("total acumulado: " + suma);
                System.out.println("num introducidos: " + contador);
                System.out.println("media: " + media);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir solo numeros.");
        }

        sc.close();
    }
}
