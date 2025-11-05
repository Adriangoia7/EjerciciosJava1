package ut03.bloque0;

import java.util.Scanner;
public class SaludoPorHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Hora fuera de rango");
        }
    }
}