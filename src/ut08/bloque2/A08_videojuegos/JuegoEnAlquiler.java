package ut08.bloque2.A08_videojuegos;

public class JuegoEnAlquiler extends Juego {

    private double precio;
    private int copiasDisponibles;
    private int diasAlquiler;


    public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d) {
        super(t, f, a);

        precio = p;
        copiasDisponibles = c;
        diasAlquiler = d;
    }


    public void alquilar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
        }
    }


    public void devolver() {
        copiasDisponibles++;
    }


    public String toString() {
        return super.toString() + "Precio: " + precio +
               "Copias: " + copiasDisponibles +
               "Días: " + diasAlquiler;
    }
}