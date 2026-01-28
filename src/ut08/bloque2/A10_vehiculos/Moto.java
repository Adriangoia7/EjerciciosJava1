package ut08.bloque2.A10_vehiculos;

public class Moto extends Vehiculo {


    public void acelerar() {
        velocidad = velocidad + 15;
    }


    public void frenar() {
        if (velocidad >= 15) {
            velocidad = velocidad - 15;
        }
    }
}