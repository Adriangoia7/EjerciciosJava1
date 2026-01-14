package ut04.bloque0;

public class Actividad04 {
    public static void main(String[] args) {
        int[] array = {7, 3, 4, 2};
        
        System.out.println("rotaciones a la   derecha:");
        imprimirArray(array, "original");
        for (int i = 1; i <= array.length; i++) {
        rotarDerecha(array);
            imprimirArray(array, "rotación " + i);
        }
        
        array = new int[]{7, 3, 4, 2};
        System.out.println("Rrotaciones a  la izquierda:");
        imprimirArray(array, "original");
        for (int i = 1; i <= array.length; i++) {
          rotarIzquierda(array);
            imprimirArray(array, "rotacion " + i);
        }
    }
    
    public static void rotarDerecha(int[] v) {
        int ultimo = v[v.length - 1]; 
        for (int i = v.length - 1; i > 0; i--) {
            v[i] = v[i - 1];
        }
        v[0] = ultimo;
    }
    
    public static void rotarIzquierda(int[] v) {
        int primero = v[0]; 
        for (int i = 0; i < v.length - 1; i++) {
            v[i] = v[i + 1]; 
        }
        v[v.length - 1] = primero;
    }
    
    public static void imprimirArray(int[] v, String etiqueta) {
        System.out.print(etiqueta + ": ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}