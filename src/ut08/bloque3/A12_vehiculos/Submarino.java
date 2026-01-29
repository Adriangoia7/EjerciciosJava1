package ut08.bloque3.A12_vehiculos;

public class Submarino extends Acuatico {

    private double profundidad;


    public Submarino(String m, String mo, double e, double p) {
        super(m, mo, e);
        profundidad = p;
    }

    public void imprimir() {
        System.out.println("Submarino " + matricula + modelo + "Eslora: " + eslora + "Profundidad: " + profundidad);
    }
}