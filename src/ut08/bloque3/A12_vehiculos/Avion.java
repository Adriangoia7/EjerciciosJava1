package ut08.bloque3.A12_vehiculos;

public class Avion extends Aereo {

    private int tiempoVuelo;


    public Avion(String m, String mo, int a, int t) {
        super(m, mo, a);
        tiempoVuelo = t;
    }

    public void imprimir() {
        System.out.println("Avion " + matricula + modelo + "Asientos: " + asientos + "Tiempo vuelo: " + tiempoVuelo);
    }
}