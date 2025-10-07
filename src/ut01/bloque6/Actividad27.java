package ut01.bloque6;

public class Actividad27 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 100000); // va a salir entre 0 y 99999
        System.out.printf("el número premiado del cupón es: %05d\n", numero);
    }
}