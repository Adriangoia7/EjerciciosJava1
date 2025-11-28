package ut03.bloque3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // getters
    public String getMarca() { 
        return marca; }
    public String getModelo() { 
        return modelo; }
    public double getPrecio() { 
        return precio; }
    
        // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double precioConIVA() {
        return precio * 1.21;
    }
}

public class PrecioVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String marca = "";
        String modelo = "";
        double precio = 0;
        
        try {
            System.out.print("Introduce la marca: ");
            marca = scanner.nextLine();
            
            System.out.print("Introduce el modelo: ");
            modelo = scanner.nextLine();
            
            System.out.print("Introduce el precio: ");
            precio = scanner.nextDouble();
            
            Vehiculo coche = new Vehiculo(marca, modelo, precio);
            
            System.out.println("Marca: " + coche.getMarca());
            System.out.println("Modelo: " + coche.getModelo());
            System.out.println("Precio final con IVA: " + coche.precioConIVA());
            
        } catch (InputMismatchException e) {
            System.out.println("Error: El precio tienbe que ser un número.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede calcular el precio con el IVA.");
        }
        
        scanner.close();
    }
}