package ut08.bloque3.A12_vehiculos;

public class Moto extends Terrestre {

    private String color;


    public Moto(String m, String mo, int r, String c) {
        super(m, mo, r);
        color = c;
    }

    public void imprimir() {
        System.out.println("Moto " + matricula + modelo + "Ruedas: " + ruedas + "Color: " + color);
    }
}