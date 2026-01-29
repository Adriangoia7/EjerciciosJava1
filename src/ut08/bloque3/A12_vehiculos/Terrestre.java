package ut08.bloque3.A12_vehiculos;

public class Terrestre extends Vehiculo {

    protected int ruedas;


    public Terrestre(String m, String mo, int r) {
        super(m, mo);
        ruedas = r;
    }


    public int getRuedas() {
        return ruedas;
    }


    public void imprimir() {
        System.out.println("Terrestre" + matricula + modelo + "Ruedas: " + ruedas);
    }
}