package ut04.inicial;

import java.util.Scanner;

public class Actividad16 {
    private String nombre;
    private double precio;
    private int stock;

    public Actividad16(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }



    public double getPrecio() {
        return precio;
    }



    public int getStock() {
        return stock;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actividad16[] productos = new Actividad16[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Nombre producto " + (i + 1) + ": ");
                String nombre = sc.next();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

            productos[i] = new Actividad16(nombre, precio, stock);
        }

        System.out.println("\nLISTADO PRODUCTOS");
        for (Actividad16 p : productos) {
            p.mostrarInfo();
        }
    }




}
