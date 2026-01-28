package ut08.bloque2.A09_fnmt;

public class Moneda extends Dinero {

    private double diametro;
    private double peso;


    public Moneda(double v, int a, double d, double p) {
        super(v, a);

        diametro = d;
        peso = p;
    }


    public String toString() {
        return "MONEDA - Valor: " + valor +"Año: " + añoEmision + "Diametro: " + diametro +
      "Peso: " + peso;
    }
}
