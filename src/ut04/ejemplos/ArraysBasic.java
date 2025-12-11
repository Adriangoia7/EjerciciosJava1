package ut04.ejemplos;

import java.util.*;

public class ArraysBasic {
    public static void main(String[] args) {
        int cantidad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de alumnos:");
        cantidad = sc.nextInt();

        //Declarar array
        int numeros[] = {4, 5, 8, 10, 3, 2, 5, 4, 6, 7, 9};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 10) {
                continue;
            }
            System.out.println(numeros[i]);
        }

            int[] numeros2;
            String noms[] = new String[cantidad];

        //Inicialitzar array
            numeros2 = new int[10];
            numeros2[6]= 7;
            numeros2[6] = 10;
            numeros2[6] = numeros[1] + 4 + numeros2[6];
            
        //Guardar dades en array
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Introduce un nuevo nombre");
                noms[i] = sc.next();
            }


        //Mostrar dades array
            for (int i = 0; i < noms.length; i++) {
                System.out.println("Nom del alumne nº "+i+" es: " +noms[i]);
            }

           /* System.out.print("For each. Nom de tots els alumnes: ");
            for (String alumne : noms) {
                System.out.print(alumne + " ");
            }*/

        //Recorrer array ascendent for i foreach


        //Recorrer array descendent for
            System.out.print("For descendent. Noms del reves: ");

            for (int j = noms.length-1; j >= 0; j--) {
                System.out.println(noms[j] +" ");
            }

        //Buscar un dato en array while
        int k = 0;
        while (k < numeros.length) {
            if (numeros[k] == 10) {
                break;
            }
            k++;
        }

        while (k < numeros.length || numeros[k]!=10) {
            k++;
        }

        
    }
}
