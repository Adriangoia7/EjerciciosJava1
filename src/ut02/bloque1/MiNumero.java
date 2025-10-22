package ut02.bloque1;

public class MiNumero {
    private int numero;

    public MiNumero(int numero) {
        this.numero = numero;
    }

    public int doble() {
        return numero * 2;
    }

    public int triple() {
        return numero * 3;
    }

    public int cuadruple() {
        return numero * 4;
    }

    public static void main(String[] args) {
        MiNumero n = new MiNumero(5);
        System.out.println(n.doble());
        System.out.println(n.triple());
        System.out.println(n.cuadruple());
    }
}