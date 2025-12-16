package ut04.inicial;

public class Actividad03 {
     public static void main(String[] args) {
    int[] numeros = new int[15];

    int suma = 0;
        int max = 0;
        int min = 101;
        int posMax = -1; 
        int posMin = -1;  
        int pares = 0;
        boolean existe50 = false;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
             suma += numeros[i];

             if (numeros[i] > max) {
                max = numeros[i];
                posMax = i;
             }

                if (numeros[i] < min) {
                min = numeros[i];
                posMin = i;
                }

                if (numeros[i] % 2 == 0) {
                pares++;
            }

            if (numeros[i] == 50) {
                existe50 = true;
            }
        }

        double media = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max + " en posición " + posMax);
        System.out.println("Mínimo: " + min + " en posición " + posMin);
        System.out.println("Media: " + media);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Suma primer y último: " + (numeros[0] + numeros[14]));
        
        if (existe50) {
            System.out.println("existe 50");
        }
    }
        }