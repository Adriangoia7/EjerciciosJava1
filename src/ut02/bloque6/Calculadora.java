package ut02.bloque6;

import java.util.Random;

public class Calculadora {

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static int generaAleatorio(int minimo, int maximo) {
        Random rand = new Random();
        return rand.nextInt(maximo - minimo + 1) + minimo;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 3.0;
        int min = 5;
        int max = 15;

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicacion: " + multiplicacion(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        System.out.println("Division por cero: " + division(num1, 0));
        System.out.println("Potencia: " + potencia(2, 3)); // 2^3
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + generaAleatorio(min, max));
    }
}