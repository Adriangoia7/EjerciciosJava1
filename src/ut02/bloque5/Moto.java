package ut02.bloque5;

public class Moto {

    private int velocidad;

    public Moto() {
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera(int mas) {
        this.velocidad = this.velocidad + mas;
    }

    public void frena(int menos) {
        this.velocidad = this.velocidad - menos;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
}