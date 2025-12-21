package ut04.inicial;


public class Actividad11 {
    
    public static int[] seleccion(int[] v, int n) {
        
        int contador = 0;
        for (int num : v) {
            if (num % 2 == 0 && num > n) {
                contador++;
            }
        }

        int[] resultado = new int[contador];
        int j = 0;
        for (int num : v) {
            if (num % 2 == 0 && num > n) {
                resultado[j] = num;
                j++;
            }
        }
        return resultado;
    }

    public static void imprimir(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test = new int[100];
        for (int i = 0; i < test.length; i++) {
            test[i] = (int) (Math.random() * 200) + 1;
        }

        int[] paresMayores10 = seleccion(test, 10);
        System.out.print("Pares > 10: ");
        imprimir(paresMayores10);
    }
}