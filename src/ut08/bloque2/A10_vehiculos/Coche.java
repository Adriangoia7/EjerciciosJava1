package ut08.bloque2.A10_vehiculos;

public class Coche extends Vehiculo {


    public void acelerar() {
        velocidad = velocidad + 10;
    }


    public void frenar() {
        if (velocidad >= 10) {
            velocidad = velocidad - 10;
        }
    }
}