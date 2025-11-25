package ut03.bloque2;

import java.util.Scanner;

import java.util.Scanner;

public class Calculadora {
    public static double calcular(double num1, char operador, double num2) {
        if (operador == '+') {
            return num1 + num2;
        } else if (operador == '-') {
            return num1 - num2;
        } else if (operador == '*') {
            return num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("No se puede dividir por cero");
                return 0;
            }
        } else {
            System.out.println("Operador no válido");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el operador (+, -, *, /):");
        String operadorStr = scanner.next(); // Pedimos texto
        char operador = operadorStr.charAt(0); // Tomamos el primer carácter

        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = calcular(num1, operador, num2);

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}