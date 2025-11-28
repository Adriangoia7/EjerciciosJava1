package ut03.bloque3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introduce un numero: ");
            int numA = scanner.nextInt();
            
            System.out.print("Introduce el segundo número: ");
            int numB = scanner.nextInt();
            
            int resultado = numA / numB;
            System.out.println("El resultado de " + numA + " / " + numB + " es: " + resultado);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Pon numero enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        }
        
        scanner.close();
    }
}