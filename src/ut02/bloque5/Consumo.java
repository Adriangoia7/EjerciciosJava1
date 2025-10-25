package ut02.bloque5;

public class Consumo {

    private double kilometros;
    private double litros;
    private double vmed;
    private double pgas;

    public Consumo(double kilometros, double litros, double vmed, double pgas) {
        this.kilometros = kilometros;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public double getTiempo() {
        return kilometros / vmed;
    }

    public double consumoMedio() {
        return (litros / kilometros) * 100;
    }

    public double consumoEuros() {
        return consumoMedio() * pgas;
    }
}