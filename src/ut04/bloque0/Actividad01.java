package ut04.bloque0;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] estaturas = new double[10]; 
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la estatura de la persona " + (i + 1) +": ");
            estaturas[i] = teclado.nextDouble();
        }
        
          for (int i = 0; i < 10; i++) {
            System.out.println("Persona " + (i + 1) + ": " + estaturas[i] + " m.");
        }
        
      teclado.close();
    }
}