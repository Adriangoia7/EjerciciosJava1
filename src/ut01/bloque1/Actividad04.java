package ut01.bloque1;

import java.util.Scanner;
public class Actividad04 {
    public static void main (String arg[]){
        Scanner tec = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce un número entero");
        a = tec.nextInt();
        System.out.println("Introduce otro número entero");
        b = tec.nextInt();
        System.out.println("Los números introducidos son " + a + " y " + b);
    }
}

// si no ponemos un numero entero da error por el nextInt
// si pones un caracter 