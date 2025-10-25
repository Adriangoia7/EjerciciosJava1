package ut02.bloque4;

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

    // Método principal para probar
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 3.0;

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicacion: " + multiplicacion(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        
        
        System.out.println("Division por cero: " + division(num1, 0));
    }
}