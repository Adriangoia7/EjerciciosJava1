package ut01.bloque6;

public class Actividad28 {
    public static void main(String[] args) {
        int edad = 27;
        int nivelEstudios = 4;
        int ingresos = 25000;

        boolean jasp = (edad <= 28 && nivelEstudios > 3) || (edad < 30 && ingresos > 28000);

        System.out.println("¿Es JASP? " + jasp);
    }
}