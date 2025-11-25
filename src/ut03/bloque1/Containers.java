package ut03.bloque1;

import java.util.Scanner;

public class Containers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxContainers = 100;
        int maxPeso = 700;
        int numContainers = 0;
        int pesoTotal = 0;

        while (numContainers < maxContainers && pesoTotal < maxPeso) {
            System.out.println("Introduce el peso del container (en toneladas):");
            int peso = scanner.nextInt();

            if (pesoTotal + peso <= maxPeso) {
                pesoTotal = pesoTotal + peso;
                numContainers = numContainers + 1;
            } else {
                System.out.println("No se puede cargar se supera el peso máximo");
                break;
            }
        }

        System.out.println("Total containers cargados: " + numContainers);
        System.out.println("Peso total: " + pesoTotal + " toneladas");

        scanner.close();
    }
}