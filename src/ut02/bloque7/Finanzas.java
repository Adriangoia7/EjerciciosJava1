package ut02.bloque7;

public class Finanzas {

    private double cambioDolarEuro;

    public Finanzas() {
        this.cambioDolarEuro = 1.02;
    }

    public Finanzas(double cambio) {
        this.cambioDolarEuro = cambio;
    }

    public double dolaresToEuros(double dolares) {
        return dolares * cambioDolarEuro;
    }

    public double eurosToDolares(double euros) {
        return euros / cambioDolarEuro;
    }

    public static void main(String[] args) {
        Finanzas f1 = new Finanzas();
        Finanzas f2 = new Finanzas(0.95);

        double dolares = 100;
        double euros = 100;

        System.out.println("Con cambio por defecto (1.02):");
        System.out.println(dolares + " dolares a euros = " + f1.dolaresToEuros(dolares));
        System.out.println(euros + " euros a dolares = " + f1.eurosToDolares(euros));

        System.out.println("\nCon cambio personalizado (0.95):");
        System.out.println(dolares + " dolares a euros = " + f2.dolaresToEuros(dolares));
        System.out.println(euros + " euros a dolares = " + f2.eurosToDolares(euros));
    }
}