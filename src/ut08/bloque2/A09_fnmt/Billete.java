package ut08.bloque2.A09_fnmt;

public class Billete extends Dinero {

    private double altura;
    private double anchura;


    public Billete(double v, int a, double h, double an) {
        super(v, a);

        altura = h;
        anchura = an;
    }


    public String toString() {
        return "Bilete - Valor: " + valor +
               "Año: " + añoEmision +
               "Altura: " + altura +
               "Anchura: " + anchura;
    }
}