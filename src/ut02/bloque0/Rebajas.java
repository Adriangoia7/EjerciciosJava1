package ut02.bloque0;

public class Rebajas {
    public static double descubrePorcentaje(double precioOriginal, double precioRebajado) {
        return (precioOriginal - precioRebajado) / precioOriginal;
    }

    public static void main(String[] args) {
        double original = 100.0;
        double rebajado = 75.0;
        double descuento = descubrePorcentaje(original, rebajado);
        System.out.println(descuento);
    }
}