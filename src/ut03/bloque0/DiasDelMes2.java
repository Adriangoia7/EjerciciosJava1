package ut03.bloque0;

import java.util.Scanner;
public class DiasDelMes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch(mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 días"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 días"); break;
            case 2:
                System.out.println("28 días (o 29 si es bisiesto)"); break;
            default:
                System.out.println("Mes incorrecto");
        }
    }
}
