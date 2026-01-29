package ut08.bloque3.A12_vehiculos;

public class Aereo extends Vehiculo {

    protected int asientos;


    public Aereo(String m, String mo, int a) {
        super(m, mo);
        asientos = a;
    }


    public int getAsientos() {
        return asientos;
    }


    public void imprimir() {
        System.out.println("Aereo" + matricula + modelo + " Asientos: " + asientos);
    }
}