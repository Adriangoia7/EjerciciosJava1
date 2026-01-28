package ut08.bloque0.A03_juego;

import java.util.Random;

public class Moneda extends Sorteo {
    private Random random;
    private String ultimoResultado;

    public Moneda() {
        random = new Random();
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getUltimoResultado() {
        return ultimoResultado;
    }

    public void setUltimoResultado(String ultimoResultado) {
        this.ultimoResultado = ultimoResultado;
    }

    @Override
    public void lanzar() {
        if (random.nextBoolean()) {
            ultimoResultado = "cara";
        } else {
            ultimoResultado = "cruz";
        }
        System.out.println("moneda: " + ultimoResultado);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("moneda ultimo resultado: " + ultimoResultado);
    }
}