package ut03.bloque4;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("horas trabajadas en la semana: ");
        int horas = sc.nextInt();

        double salario;

        if (horas <= 40) {
            salario = horas * 12;
        } else {
            int extras = horas - 40;
            salario = 40 * 12 + extras * 16;
        }

        System.out.println("El salario semanal es: " + salario + " €");

        sc.close();
    }
}