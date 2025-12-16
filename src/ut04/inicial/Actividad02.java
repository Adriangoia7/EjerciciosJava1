package ut04.inicial;

public class Actividad02 {
    public static void main(String[] args) {

        int[] numeros = new int[15];

        int suma = 0;
        int max;
        int min;
        int pares = 0;

        numeros[0] = (int) (Math.random() * 100) + 1;

        max = numeros[0];
        min = numeros[0];

      for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 100) + 1;

            suma += numeros[i];

            if (numeros[i] > max) {
                max = numeros[i];
            }

            if (numeros[i] < min) {
                min = numeros[i];
            }

            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        double media = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
        System.out.println("Cantidad de pares: " + pares);

}
}