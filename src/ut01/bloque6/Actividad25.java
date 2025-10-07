package ut01.bloque6;

import java.util.Scanner;

public class Actividad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los megabytes: ");
        double mb = sc.nextDouble();

        double kb = mb * 1024;

        System.out.println(mb + " MB son " + kb + " KB");

        sc.close();
    }
}