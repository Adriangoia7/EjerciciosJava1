package ut02.bloque0;

public class Numero {
    private int valor;

    public Numero() {
        valor = 0;
    }

    public Numero(int valor) {
        this.valor = valor;
    }

    public void anyade(int n) {
        valor += n;
    }

    public void resta(int n) {
        valor -= n;
    }

    public int getValor() {
        return valor;
    }

    public int getDoble() {
        return valor * 2;
    }

    public int getTriple() {
        return valor * 3;
    }

    public void setNumero(int n) {
        valor = n;
    }
}