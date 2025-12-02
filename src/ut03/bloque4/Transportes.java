package ut03.bloque4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Transportes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el número de bultos: ");
            int numBultos = sc.nextInt();

            System.out.print("Introduce un día de la semana: ");
            int dia = sc.nextInt();

        if (numBultos > 30) {
                System.out.println("No se puede realizar el transporte: son más de 30 bultos.");
            sc.close();
                return;
            }

        if (dia == 7) { 
                System.out.println("No se puede realizar el transporte en domingo.");
        sc.close();
                return;
            }

            double pesoTotal = 0;

            for (int i = 1; i <= numBultos; i++) {
                System.out.print("Introduce el peso del bulto " + i + " en kg: ");
            double pesoBulto = sc.nextDouble();
                pesoTotal += pesoBulto;
            }

            if (pesoTotal > 1000) {
                System.out.println("No se puede realizar el transporte: peso total superior a 1000 kg.");
                sc.close();
                return;
            }

            double coste = numBultos * 30;

            if (pesoTotal > 300) {
                double kilosExtra = pesoTotal - 300;
                coste += kilosExtra * 0.9;
            }

            if (dia == 6) {
                coste += 60;
            }

            System.out.println("El precio total del transporte es: " + coste + " €");

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes poner números validos.");
        }

        sc.close();
    }
}
