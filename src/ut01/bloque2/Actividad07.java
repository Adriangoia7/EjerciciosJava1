package ut01.bloque2;

import java.util.Scanner;

public class Actividad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = sc.nextDouble();
        
        double euros = pesetas / 166.386;
        
        System.out.println(pesetas + " pesetas son " + euros + " euros.");
        
        sc.close();
    }
}