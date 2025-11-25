package ut03.bloque2;

import java.util.Scanner;

public class DibujarFiguras2 {

    public static void dibRectNumeros3(int ancho, int alto) {
        for (int f = 0; f < alto; f++) {
            
            for (int i = 1; i <= ancho; i++) {
                System.out.print(i + " ");
            }
            
            for (int i = ancho; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void dibRectAsteriscos1(int ancho, int alto) {
        for (int f = 0; f < alto; f++) {
            for (int i = 0; i < ancho; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibRectAsteriscos2(int ancho, int alto) {
        for (int f = 0; f < alto; f++) {
            for (int i = 0; i < ancho; i++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    public static void dibRectAsteriscos3(int ancho, int alto) {
        for (int f = 0; f < alto; f++) {
            for (int i = 0; i < ancho; i++) {
                if (f == 0 || f == alto - 1 || i == 0 || i == ancho - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void dibTriangulo1(int base) {
        for (int f = 1; f <= base; f++) {
            for (int i = 1; i <= f; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibTriangulo2(int altura) {
        for (int f = 1; f <= altura; f++) {
            for (int e = 1; e <= (altura - f) * 2; e++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= f; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibTriangulo3(int altura) {
        for (int f = 1; f <= altura; f++) {
            for (int e = 1; e <= (altura - f) * 2; e++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (f * 2 - 1); i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ancho del rectángulo: ");
        int ancho = sc.nextInt();

        System.out.print("Alto del rectángulo: ");
        int alto = sc.nextInt();

        System.out.println("\nRectNumeros3:");
        dibRectNumeros3(ancho, alto);

        System.out.println("\nRectAsteriscos1:");
        dibRectAsteriscos1(ancho, alto);

        System.out.println("\nRectAsteriscos2:");
        dibRectAsteriscos2(ancho, alto);

        System.out.println("\nRectAsteriscos3:");
        dibRectAsteriscos3(ancho, alto);

        System.out.print("\nBase del triángulo 1: ");
        int base = sc.nextInt();
        System.out.println("\nTriángulo 1:");
        dibTriangulo1(base);

        System.out.print("\nAltura del triángulo 2: ");
        int altura = sc.nextInt();
        System.out.println("\nTriángulo 2:");
        dibTriangulo2(altura);

        System.out.print("\nAltura del triángulo 3: ");
        altura = sc.nextInt();
        System.out.println("\nTriángulo 3:");
        dibTriangulo3(altura);

        sc.close();
    }
}