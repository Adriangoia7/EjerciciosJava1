package ut03.bloque6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotaProgramacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("nota del primer examen");
            double nota1 = sc.nextDouble();

            System.out.print("Nota del segundo examen");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media >= 5) {
                System.out.println("Tu nota de Programación es " + media);
            } else {
                System.out.print("¿Cuál ha sido el resultado de la recuperación?: ");
                String resultado = sc.next(); 

                if (resultado == "apto") {
                    System.out.println("tu nota de Programación es 5");
                } else {
                    System.out.println("tu nota de Programación es 1");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir numeros enteros para las notas");
        }

        sc.close();
    }
}