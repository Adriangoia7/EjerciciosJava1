package ut04.inicial;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas personas participan en la comida de Navidad? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] personas = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre de la persona " + (i + 1) + ": ");
            personas[i] = sc.nextLine();
        }

        System.out.println("\nLista de participantes:");
        for (String p : personas) {
            System.out.println(personas);
        }
        sc.close();} 
}