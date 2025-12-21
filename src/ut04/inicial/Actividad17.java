package ut04.inicial;

import java.util.Scanner;

public class Actividad17 {

    private String nombre;
    private double precio;
    private int stock;

    public Actividad17(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

 public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public int getStock() {
        return stock;
    }



    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - Precio: " + precio + ", Stock: " + stock);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actividad17[] productos = new Actividad17[3];

            for (int i = 0; i < 3; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            productos[i] = new Actividad17(nombre, precio, stock);
        }

        Actividad17[] copiaProductos = productos;

        System.out.println("\nCambiando producto 0 en copia...");
            copiaProductos[0].setNombre("CAMBIADO");
            copiaProductos[0].setStock(999);

        System.out.println("\n--- PRODUCTOS ORIGINALES (después del cambio) ---");
            for (Actividad17 p : productos) {
            p.mostrarInfo();
        }
    }

    
}