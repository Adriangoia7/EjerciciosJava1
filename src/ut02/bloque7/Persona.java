package ut02.bloque7;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Carlos", 30);
        Persona p3 = new Persona("Laura", 22);

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
    }
}