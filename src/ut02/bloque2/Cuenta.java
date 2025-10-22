package ut02.bloque2;

public class Cuenta {

    // Atributos
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }


    public Cuenta(String titular, double cantidad) {
        this.titular = titular;


        this.cantidad = Math.max(0, cantidad);
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
   
        this.cantidad = Math.max(0, cantidad);
    }

   
    public void mostrarDatos() {
        System.out.println("titular: " + titular + ", cantidad: " + cantidad);
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
       
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
        
    }
}