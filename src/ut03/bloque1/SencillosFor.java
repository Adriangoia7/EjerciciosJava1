package ut03.bloque1;

import java.util.Scanner;

public class SencillosFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un número:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int num = 1;
        for (int count = 0; count < n; count = count + 1) {
            System.out.print(num + " ");
            num = num + 2;
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        for (int i = n; i >= 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int suma = 0;
        for (int j = 1; j <= n; j = j + 1) {
            suma = suma + j;
        }
        System.out.println("Suma es " + suma);

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        for (int k = 1; k <= n; k = k + 1) {
            if (n % k == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int total = 0;
        for (int d = 1; d < n; d = d + 1) {
            if (n % d == 0) {
                total = total + d;
            }
        }
        System.out.println("Suma de divisores sin n es " + total);

        scanner.close();
    }
}
