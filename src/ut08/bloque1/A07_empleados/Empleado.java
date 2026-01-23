package ut08.bloque1.A07_empleados;

public class Empleado {
    protected String nombre;
    protected String dni;
    protected double sueldoMensual;

    public Empleado(String nombre, String dni, double sueldoMensual) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
    }

    public final double calcularSueldoAnual() {
        return sueldoMensual * 12;
    }
}