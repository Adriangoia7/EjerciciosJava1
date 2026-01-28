package ut08.bloque2.A10_vehiculos;

public abstract class Vehiculo {

    protected int velocidad;


    public Vehiculo() {
        velocidad = 0;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public abstract void acelerar();

    public abstract void frenar();
}