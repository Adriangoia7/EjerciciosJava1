package ut03.bloque3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Posicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Introduce la posición: ");
            int posicion = sc.nextInt(); 

            char letra = nombre.charAt(posicion - 1);
            System.out.println("En la posición " + posicion + " de " + nombre + " está la letra " + letra);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: la posición no existe dentro del nombre.");
        } catch (InputMismatchException e) {
            System.out.println("Error: la posición debe ser un número entero.");
        }

        sc.close();
    }
}  