package ut04.inicial;

import java.util.Scanner;

public class Actividad15 {

    private String nombre;
    private int edad;
    private double notaMedia;

    public Actividad15(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }



    public int getEdad() {
        return edad;
    }



    public double getNotaMedia() {
        return notaMedia;
    }

    public void mostrarInfo() {
        System.out.println(nombre + ": " + edad + " años, nota " + notaMedia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actividad15[] alumnos = new Actividad15[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();
            alumnos[i] = new Actividad15(nombre, edad, nota);
        }

        System.out.println("\nTODOS LOS ALUMNOS");
        for (Actividad15 a : alumnos) {
            a.mostrarInfo();
        }

        System.out.println("\nMAYORES DE EDAD");
        for (Actividad15 a : alumnos) {
            if (a.getEdad() >= 18) {
                System.out.println(a.getNombre() + ": " + a.getEdad() + " años");
            }
        }

        System.out.println("\nAPROBADOS");
        for (Actividad15 a : alumnos) {
            if (a.getNotaMedia() >= 5) {
                System.out.println(a.getNombre() + ": " + a.getNotaMedia());
            }
        }
    }
}