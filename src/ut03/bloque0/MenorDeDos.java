package ut03.bloque0;

import java.util.Scanner;
public class MenorDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("El menor es: " + num2);
        }
    }
}