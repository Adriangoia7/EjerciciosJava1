package ut08.bloque0.A01_centroestudios;

public class Aula {
    protected int codigo;
    protected double longitud, anchura;

    public Aula(int codigo, double longitud, double anchura) {
        this.codigo = codigo;
        this.longitud = longitud;
        this.anchura = anchura;
    }

   public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public double getLongitud() {
        return longitud;
    }



    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }



    public double getAnchura() {
        return anchura;
    }



    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double calculoCapacidad() {
        double superficie = this.longitud * this.anchura;
        return superficie / 1.4;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo + 
                          ", Superficie: " + (longitud * anchura) + 
                          ", Capacidad: " + calculoCapacidad());
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Superficie: " + (longitud * anchura) 
        + ", Capacidad: " + calculoCapacidad();
    }
}