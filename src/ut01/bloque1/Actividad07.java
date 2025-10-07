package ut01.bloque1;

import java.util.*;

public class DatosPersonales {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = tec.nextLine();

        System.out.print("Edad: ");
        int edad = tec.nextInt();

        System.out.print("Horas a la semana que estudias: ");
        double horasEstudia = tec.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Horas semanales de estudio: " + horasEstudia);
        //y asi con todos los datos que queramos pedir
    }
}
