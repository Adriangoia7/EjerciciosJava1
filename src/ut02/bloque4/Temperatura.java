package ut02.bloque4;

public class Temperatura {

    // Convierte grados Celsius a Farenheit
    public static double celsiusToFarenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    // Convierte grados Farenheit a Celsius
    public static double farenheitToCelsius(double farenheit) {
        return (farenheit - 32) / 1.8;
    }

    // Prueba de los métodos
    public static void main(String[] args) {
        double celsius = 20;
        double farenheit = 68;

        System.out.println(celsius + " grados Celsius = " + celsiusToFarenheit(celsius) + " Farenheit");
        System.out.println(farenheit + " grados Farenheit = " + farenheitToCelsius(farenheit) + " Celsius");
    }
}