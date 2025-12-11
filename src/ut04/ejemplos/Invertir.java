package ut04.ejemplos;

public class Invertir {

    public static int[] invertirArray(int[] v) {
        int[] inv = new int[v.length];

        for (int i = 0; i < v.length; i++) {
              inv[i] = v[v.length - 1 - i];
        }
            return inv;
    }

    public static void imprimirArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
     System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

            int[] invertido = invertirArray(numeros);

    imprimirArray(invertido);
    }
}
