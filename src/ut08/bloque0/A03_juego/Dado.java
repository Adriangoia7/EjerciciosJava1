package ut08.A03_juego;

import java.util.Random;

public class Dado extends Sorteo {
    private Random random;
    private int ultimoValor;

    public Dado() {
        random = new Random();
    }

    public Random getRandom() {
        return random;
    }



    public void setRandom(Random random) {
        this.random = random;
    }



    public int getUltimoValor() {
        return ultimoValor;
    }



    public void setUltimoValor(int ultimoValor) {
        this.ultimoValor = ultimoValor;
    }

    @Override
    public void lanzar() {
        ultimoValor = random.nextInt(6) + 1;
        System.out.println("dado: " + ultimoValor);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("dado ultimo valor: " + ultimoValor);
    }
}
