package ut08.bloque1.A07_empleados;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String dni, double sueldoMensual, double bono) {
        super(nombre, dni, sueldoMensual);
        this.bono = bono;
    }

    public final double calcularSueldoBono() {
        return calcularSueldoAnual() + bono;
    }
}