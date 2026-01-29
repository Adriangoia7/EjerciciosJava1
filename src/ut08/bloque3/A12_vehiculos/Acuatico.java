package ut08.bloque3.A12_vehiculos;

public class Acuatico extends Vehiculo {

    protected double eslora;


    public Acuatico(String m, String mo, double e) {
        super(m, mo);
        eslora = e;
    }

    public double getEslora() {
        return eslora;
    }

    public void imprimir() {
        System.out.println("Acuatico " + matricula + modelo + " Eslora: " + eslora);
    }
}