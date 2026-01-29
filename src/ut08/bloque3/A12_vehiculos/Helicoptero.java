package ut08.bloque3.A12_vehiculos;

public class Helicoptero extends Aereo {

    private int helices;


    public Helicoptero(String m, String mo, int a, int h) {
        super(m, mo, a);
        helices = h;
    }


    public void imprimir() {
        System.out.println("Helicoptero " + matricula + modelo + "Asientos: " + asientos + "Helices: " + helices);
    }
}