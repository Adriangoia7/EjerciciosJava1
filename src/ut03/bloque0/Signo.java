package ut03.bloque0;

import java.util.Scanner;
public class Signo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if (num > 0) {
                System.out.println("Positivo");
            } else if (num < 0) {
                System.out.println("Negativo");
            }
        } while (num != 0);
        System.out.println("Fin del programa");
    }
}