package ut08.bloque2.A08_videojuegos;

public class Juego {

    protected String titulo;
    protected String fabricante;
    protected int año;


    public Juego(String t, String f, int a) {
        titulo = t;
        fabricante = f;
        año = a;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAño() {
        return año;
    }


    public String toString() {
        return titulo + " - " + fabricante + " - " + año;
    }


    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o instanceof Juego) {
            Juego j = (Juego) o;

            return titulo.equals(j.titulo) &&
                   fabricante.equals(j.fabricante) &&
                   año == j.año;
        }

        return false;
    }
}