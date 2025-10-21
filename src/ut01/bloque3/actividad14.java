package ut01.bloque3;

import java.util.Scanner;

public class actividad14 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = sca.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);

        sca.close();
    }
}