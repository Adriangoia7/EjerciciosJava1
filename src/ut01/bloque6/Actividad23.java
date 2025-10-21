package ut01.bloque6;

import java.util.Scanner;

public class Actividad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pon un número real: ");
        double num = sc.nextDouble();

        double redondeado = Math.round(num * 10.0) / 10.0;
        System.out.println("El número " + num + ", redondeado a un decimal es " + redondeado);

        sc.close();
    }
}