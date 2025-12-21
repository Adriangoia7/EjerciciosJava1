package ut04.inicial;
import java.util.Scanner;

public class Actividad14 {

    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor
    public Actividad14(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public double getNotaMedia() {
        return notaMedia;
    }



    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + notaMedia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actividad14[] alumnos = new Actividad14[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Nombre alumno " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Nota media: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alumnos[i] = new Actividad14(nombre, edad, nota);
        }

        System.out.println("\n--- LISTADO ALUMNOS ---");
        for (Actividad14 a : alumnos) {
            a.mostrarInfo();
        }
    }



    
}
