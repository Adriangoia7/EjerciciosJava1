package ut03.bloque0;

import java.util.Scanner;
public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("El menor es: " + a);
        } else if (b < a && b < c) {
            System.out.println("El menor es: " + b);
        } else {
            System.out.println("El menor es: " + c);
        }
    }
}