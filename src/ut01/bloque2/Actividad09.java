package ut01.bloque2;

import java.util.Scanner;

public class Actividad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce los kilobytes (KB): ");
        double kb = sc.nextDouble();
        
        double mb = kb / 1024;
        
        System.out.println(kb + " KB son " + mb + " MB.");
        
        sc.close();
    }
}