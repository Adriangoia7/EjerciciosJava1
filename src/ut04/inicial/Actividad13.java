package ut04.inicial;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de DNI: ");
            int dni = sc.nextInt();

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X', 'B', 'N', 'J', 'Z',  'S',  'Q', 'V', 'H', 'L',  'C', 'K', 'E'};

            int resto = dni % 23;
            char letra = letras[resto];

        System.out.println("Tu DNI completo es: " + dni + letra);
    }
}
