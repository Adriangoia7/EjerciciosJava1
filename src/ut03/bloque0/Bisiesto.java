package ut03.bloque0;

import java.util.Scanner;
public class Bisiesto {
    public static boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();
        if (esBisiesto(año)) {
            System.out.println(año + " es bisiesto");
        } else {
            System.out.println(año + " no es bisiesto");
        }
    }
}