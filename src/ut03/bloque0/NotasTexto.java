package ut03.bloque0;

import java.util.Scanner;
public class NotasTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if (nota < 1 || nota > 10) {
            System.out.println("Nota fuera de rango");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota <= 6) {
            System.out.println("Bien");
        } else if (nota <= 8) {
            System.out.println("Notable");
        } else { // 9 o 10
            System.out.println("Sobresaliente");
        }
    }
}