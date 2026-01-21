package ut08.A02_trabajadores;

public class TestTrabajadores {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("12345678A", "Juan", "Pérez", 2000, "mañana");
        Encargado encargado = new Encargado("87654321B", "Ana", "García", 2200, "tarde", "Ventas", 5);

        empleado.mostrarDatos();
        encargado.mostrarDatos();
    }
}