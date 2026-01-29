package ut08.bloque3.A11_centrocomercial;

public class TvTubo extends Televisor {

    private int lineas;


    public TvTubo(String m, String mo, double p, double pu, int l) {
        super(m, mo, p, pu);

        lineas = l;
    }


    public String resolucion() {
        return lineas + " lineas";
    }
}