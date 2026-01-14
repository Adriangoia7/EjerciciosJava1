package ut04.bloque0;

import java.util.Random;

public class Actividad08 {
    final static int LANZAMIENTOS = 10000;
    final static int FRECUENCIA = 1000;
    
    public static void main(String[] args) {
        Random random = new Random();
      int[] veces = new int[7];
        int lanzamientos = 0;
        
        for (int i = 1; i <= LANZAMIENTOS; i++) {
            int dado = random.nextInt(6) + 1; 
             veces[dado]++;
            lanzamientos++;

            if (lanzamientos % FRECUENCIA == 0) {
             mostrarEstadisticas(veces, lanzamientos);
            }
        }
    }
    
    public static void mostrarEstadisticas(int[] veces, int total) {
        System.out.println("numero de lanzamiento: " + total);
        for (int num = 1; num <= 6; num++) {
            double porcentaje = (double) veces[num] / total * 100;
            System.out.printf("%d: %.2f%%\n", num, porcentaje);
        }
        System.out.println();
    }
}