package ut03.bloque3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        String nombre;
        double nota;

        double sumaNotas = 0;
        int contadorAlumnos = 0;

        try {
            System.out.print("Introduce el código del alumno: ");
            codigo = sc.nextInt();

            while (codigo >= 0) {
                System.out.print("Introduce el nombre del alumno: ");
                nombre = sc.next();  

                System.out.print("Introduce la nota del alumno: ");
                nota = sc.nextDouble();  

                sumaNotas += nota;
                contadorAlumnos++;

                System.out.print("Introduce el código del siguiente alumn: ");
                codigo = sc.nextInt();
            }

            if (contadorAlumnos == 0) {
                System.out.println("No se han introducido alumnos.");
            } else {
                double media = sumaNotas / contadorAlumnos;
                System.out.println("La nota media de la clase es: " + media);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: La nota debe ser un número.");
        }

        sc.close();
    }
}