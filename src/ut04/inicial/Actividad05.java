package ut04.inicial;

public class Actividad05 {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 8, 10, 20, 21, 30, 40, 50, 60, 70, 80, 90, 100};

        boolean ordenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] >= numeros[i + 1]) {
                ordenado = false;
                break; 
            }
        }

        if (ordenado) {
            System.out.println("El array está ordenado de forma ascendente.");
        } else {
            System.out.println("El array NO está ordenado de forma ascendente.");
        }
    }
}