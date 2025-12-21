package ut04.inicial;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de alumnos: ");
        int num = sc.nextInt();
            sc.nextLine();

         String[] nombres = new String[num];
        double[] notas = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Nombre alumno " + (i + 1) + ": ");
                nombres[i] = sc.nextLine();
                 System.out.print("Nota media: ");
                notas[i] = sc.nextDouble();
                  sc.nextLine();
        }

        System.out.println("\nLista de alumnos:");
        for (int i = 0; i < num; i++) {
            System.out.println(nombres[i] + ": " + notas[i]);
        }
    }
}