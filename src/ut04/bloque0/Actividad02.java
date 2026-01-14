package ut04.bloque0;

public class Actividad02 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("array original: ");
        imprimirArray(original);
        
      int[] invertido = invertirArray(original);
        
        System.out.print("array invertido: ");
     imprimirArray(invertido);
    }
    
    public static int[] invertirArray(int[] v) {
            int[] nuevo = new int[v.length];  
        for (int i = 0; i < v.length; i++) { 
      nuevo[i] = v[v.length - 1 - i];  
        }
        return nuevo;
    }
    public static void imprimirArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
          if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}