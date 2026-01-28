package ut08.bloque2.A09_fnmt;

public abstract class Dinero {

    protected double valor;
    protected int añoEmision;


    public Dinero(double v, int a) {
        valor = v;
        añoEmision = a;
    }


    public double getValor() {
        return valor;
    }

    public int getAñoEmision() {
        return añoEmision;
    }


    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o instanceof Dinero) {
            Dinero d = (Dinero) o;

            return valor == d.valor &&
                   añoEmision == d.añoEmision;
        }

        return false;
    }
}