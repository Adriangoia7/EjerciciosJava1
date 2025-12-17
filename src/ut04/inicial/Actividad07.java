package ut04.inicial;

public class Actividad07 {

    public static int[] invertir(int[] v) {
        int[] r = new int[v.length];

        int j = 0;
        for (int i = v.length - 1; i >= 0; i--) {
            r[j] = v[i];
            j++;
        }

        return r;
    }

         public static int[] rotarDerecha(int[] v) {
        int[] r = new int[v.length];

            r[0] = v[v.length - 1];

        for (int i = 0; i < v.length - 1; i++) {
            r[i + 1] = v[i];
        }

        return r;
    }

    public static int[] rotarIzquierda(int[] v) {
        int[] r = new int[v.length];

             r[v.length - 1] = v[0];

        for (int i = 1; i < v.length; i++) {
            r[i - 1] = v[i];
 }

        return r;
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5};

        int[] inv = invertir(datos);
        int[] der = rotarDerecha(datos);
        int[] izq = rotarIzquierda(datos);

        System.out.print("Original: ");
        for (int n : datos) System.out.print(n + " ");
        System.out.println();

        System.out.print("Invertido: ");
        for (int n : inv) System.out.print(n + " ");
        System.out.println();

        System.out.print("Derecha: ");
        for (int n : der) System.out.print(n + " ");
        System.out.println();

        System.out.print("Izquierda: ");
        for (int n : izq) System.out.print(n + " ");
        System.out.println();
    }
}