package ut04.ejemplos;

public class DosArrays {

    public static double[] sumaArraysIguales(double a[], double b[]) {
        double[] resultado = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }

        return resultado;
    }

    public static double[] sumaArrays(double a[], double b[]) {
        int max = (a.length > b.length) ? a.length : b.length;
        double[] resultado = new double[max];

        for (int i = 0; i < max; i++) {
            double va = 0;
            double vb = 0;

                if (i < a.length) {
                va = a[i];
            }
            if (i < b.length) {
                vb = b[i];
            }

        resultado[i] = va + vb;
        }

        return resultado;
    }

    public static void imprimirArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0};
        double[] b = {4.0, 5.0, 6.0, 7.0};

        double[] r1 = sumaArraysIguales(a, new double[]{4.0, 5.0, 6.0});
        double[] r2 = sumaArrays(a, b);

        imprimirArray(r1);
        imprimirArray(r2);
    }
}
