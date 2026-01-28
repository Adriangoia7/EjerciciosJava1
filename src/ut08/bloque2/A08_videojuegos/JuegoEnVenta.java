package ut08.bloque2.A08_videojuegos;

public class JuegoEnVenta extends Juego {

    private double precio;
    private int copiasDisponibles;


    public JuegoEnVenta(String t, String f, int a, double p, int c) {
        super(t, f, a);

        precio = p;
        copiasDisponibles = c;
    }


    public void vender() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
        }
    }


    public String toString() {
        return super.toString() + "Precio: " + precio +
               "Copias: " + copiasDisponibles;
    }
}