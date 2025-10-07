package ut01.bloque6;

import java.util.Scanner;

public class Actividad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("número entero: ");
        int numero = sc.nextInt();

        int penultima = (numero / 10) % 10;

        System.out.println("La penúltma cifra de " + numero + " es " + penultima);

        sc.close();
    }
}