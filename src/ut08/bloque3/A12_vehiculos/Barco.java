package ut08.bloque3.A12_vehiculos;

public class Barco extends Acuatico {

    private boolean motor;


    public Barco(String m, String mo, double e, boolean mo2) {
        super(m, mo, e);
        motor = mo2;
    }

    public void imprimir() {
        System.out.println("Barco " + matricula + modelo + "Eslora: " + eslora + "Motor: " + motor);
    }
}