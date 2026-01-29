package ut08.bloque3.A11_centrocomercial;

public class TvLcd extends Televisor {

    private int pixelesH;
    private int pixelesV;


    public TvLcd(String m, String mo, double p, double pu, int h, int v) {
        super(m, mo, p, pu);

        pixelesH = h;
        pixelesV = v;
    }


    public String resolucion() {
        return pixelesH + " x " + pixelesV + " pixeles";
    }
}