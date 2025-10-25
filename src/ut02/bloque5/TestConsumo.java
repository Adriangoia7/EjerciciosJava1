package ut02.bloque5;

public class TestConsumo {
    public static void main(String[] args) {
        Consumo viaje = new Consumo(500, 40, 100, 1.8);
        System.out.println("Tiempo (h): " + viaje.getTiempo());
        System.out.println("Consumo medio (l/100km): " + viaje.consumoMedio());
        System.out.println("Consumo medio (euros/100km): " + viaje.consumoEuros());
    }
}