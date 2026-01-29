package ut08.bloque3.A11_centrocomercial;

public abstract class Televisor {

    protected String marca;
    protected String modelo;
    protected double precio;
    protected double pulgadas;


    public Televisor(String m, String mo, double p, double pu) {
        marca = m;
        modelo = mo;
        precio = p;
        pulgadas = pu;
    }


    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o instanceof Televisor) {
            Televisor t = (Televisor) o;

        
        }        return false;
    }


    public abstract String resolucion();


    public String toString() {
        return marca + " " + modelo + "Precio: " + precio + "Pulgadas: " + pulgadas + "Resolucion: " + resolucion();
    }
}