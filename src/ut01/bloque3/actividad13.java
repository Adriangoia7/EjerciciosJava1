package ut01.bloque3;

import java.util.Scanner;

public class actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double G = 6.693e-11;

        System.out.print("primero (kg): ");
        double m1 = sc.nextDouble();

        System.out.print("egundo (kg): ");
        double m2 = sc.nextDouble();

        System.out.print("distancia (m): ");
        double d = sc.nextDouble();

        double F = (G * m1 * m2) / (d);

        System.out.println("atracción : " + F + " N");

        sc.close();
    }
}