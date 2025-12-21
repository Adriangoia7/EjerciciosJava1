package ut04.inicial;

public class Actividad12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }

        for (int num : numeros) {
            System.out.println("Número: " + num + 
                          ", Cuadrado: " + num * num + 
                      ", Cubo: " + num * num * num);
        }
    }
}