package ut03.bloque0;

import java.util.Scanner;
public class MenorDeTresSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int menor;
        if (a < b) {
            if (a < c) {
                menor = a;
            } else {
                menor = c;
            }
        } else {
            if (b < c) {
                menor = b;
            } else {
                menor = c;
            }
        }
        System.out.println("El menor es: " + menor);
    }
}
