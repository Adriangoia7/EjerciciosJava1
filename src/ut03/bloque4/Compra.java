package ut03.bloque4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {

    public static double impFinal(double precio, int unidades, double iva, double descuento) {
        double base = precio * unidades;
        double conIva = base + base * (iva / 100);
        double conDescuento = conIva - conIva * (descuento / 100);
        return conDescuento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("precio del producto: ");
            double precio = sc.nextDouble();

            System.out.println("unidades compradas: ");
            int unidades = sc.nextInt();

            System.out.println("Porcentaje de IVA: ");
            double iva = sc.nextDouble();

            System.out.println("Porcentaje de descuento: ");
            double descuento = sc.nextDouble();

            double importe = impFinal(precio, unidades, iva, descuento);
            System.out.println("Importe final de la compra: " + importe + " €");

        } catch (InputMismatchException e) {
            System.out.println("Error: escribe numeros validos.");
        }

        sc.close();
    }
}