package ut04.bloque0;

public class Actividad03 {
    public static void main(String[] args) {
        double[] a1 = {1.5, 2.3, 3.7};
        double[] b1 = {4.2, 5.1, 6.4};
        System.out.print("Suma arrays iguales: ");
        imprimirArray(sumaArraysIguales(a1, b1));
        
        double[] a2 = {1.1, 2.2, 3.3, 4.4};
        double[] b2 = {5.5, 6.6};
        System.out.print("Suma arrays distintos: ");
        imprimirArray(sumaArrays(a2, b2));
    }
    
    public static double[] sumaArraysIguales(double[] a, double[] b) {
        double[] resultado = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }
    
    public static double[] sumaArrays(double[] a, double[] b) {
        int tamMax = Math.max(a.length, b.length);
        double[] resultado = new double[tamMax];
        for (int i = 0; i < tamMax; i++) {
            double valA = (i < a.length) ? a[i] : 0.0;
            double valB = (i < b.length) ? b[i] : 0.0;
            resultado[i] = valA + valB;
        }
        return resultado;
    }
    
    public static void imprimirArray(double[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}