package ut03.bloque1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 0;
        int aprobados = 0;
        int suma = 0;
        int nota;

        System.out.println("Introduce una nota (negativa para terminar):");
        nota = scanner.nextInt();

        while (nota >= 0) {
            totalNotas = totalNotas + 1;
            suma = suma + nota;
            if (nota >= 5) {
                aprobados = aprobados + 1;
            }
            System.out.println("Introduce otra nota (negativa para terminar):");
            nota = scanner.nextInt();
        }

        if (totalNotas > 0) {
            double media = (double) suma / totalNotas;
            System.out.println("Número de notas introducidas: " + totalNotas);
            System.out.println("Número de aprobados: " + aprobados);
            System.out.println("Nota media: " + media);
        } else {
            System.out.println("No se introdujeron notas.");
        }

        scanner.close();
    }
}
