package ut01.bloque2;

import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();
        
        double resultado = num1 * num2 * num3;
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
        
        sc.close();
    }
}