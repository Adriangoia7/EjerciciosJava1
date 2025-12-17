package ut04.inicial;

import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        int num, contador = 0;
        boolean encontrado;

        while (contador < 10) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();

            encontrado = false;
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == num) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                numeros[contador] = num;
                contador++;
            } else {
                System.out.println("Número repetido, introduce otro");
            }
        }

        System.out.println("Array fianal:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

    }
}
