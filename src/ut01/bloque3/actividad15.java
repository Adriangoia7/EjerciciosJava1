package ut01.bloque3;

public class Actividad15 {
    public static void main(String[] args) {
        double precioBase = 120;
        double descuento = 0.15;
        double iva = 0.21;

        double precioConDescuento = precioBase - (precioBase * descuento);
        double precioFinal = precioConDescuento + (precioConDescuento * iva);

        System.out.println("Precio base: " + precioBase + " €");
        System.out.println("Precio con descuento: " + precioConDescuento + " €");
        System.out.println("Precio final con IVA: " + precioFinal + " €");
    }
}