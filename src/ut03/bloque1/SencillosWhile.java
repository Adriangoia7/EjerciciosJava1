package ut03.bloque1;

import java.util.Scanner;

public class SencillosWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame un número:");
        int n = scanner.nextInt();
        
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i = i + 1;
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int count = 0;
        int num = 1;
        while (count < n) {
            System.out.print(num + " ");
            num = num + 2;
            count = count + 1;
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        while (n >= 0) {
            System.out.print(n + " ");
            n = n - 1;
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int suma = 0;
        int j = 1;
        while (j <= n) {
            suma = suma + j;
            j = j + 1;
        }
        System.out.println("Suma es " + suma);

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int k = 1;
        while (k <= n) {
            if (n % k == 0) {
                System.out.print(k + " ");
            }
            k = k + 1;
        }
        System.out.println();

        System.out.println("Dame otro número:");
        n = scanner.nextInt();
        int total = 0;
        int d = 1;
        while (d < n) {
            if (n % d == 0) {
                total = total + d;
            }
            d = d + 1;
        }
        System.out.println("Suma de divisores sin n es " + total);
        
        scanner.close();
    }
}
