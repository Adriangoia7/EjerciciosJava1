package ut08.bloque3.A12_vehiculos;

public class Coche extends Terrestre {

    private boolean aire;


    public Coche(String m, String mo, int r, boolean a) {
        super(m, mo, r);
        aire = a;
    }

    public void imprimir() {
        System.out.println("Coche " + matricula +  modelo + "Ruedas: " + ruedas);
    }
}