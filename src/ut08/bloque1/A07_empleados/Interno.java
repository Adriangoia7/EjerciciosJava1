package ut08.bloque1.A07_empleados;

public final class Interno extends Empleado {
    private int tiempoTrabajado;

    public Interno(String nombre, String dni, double sueldoMensual, int tiempoTrabajado) {
        super(nombre, dni, sueldoMensual);
        this.tiempoTrabajado = tiempoTrabajado;
    }
}