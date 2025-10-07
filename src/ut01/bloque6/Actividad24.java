package ut01.bloque6;

import java.util.Scanner;

public class Actividad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas en la semana: ");
        int horas = sc.nextInt();

        double salario = horas * 12;

        System.out.println("El salario semanal es: " + salario + " euros");

        sc.close();
    }
}