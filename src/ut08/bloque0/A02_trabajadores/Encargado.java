package ut08.A02_trabajadores;

public class Encargado extends Empleado {
    private String area;
    private int numEmpleados;

    public Encargado(String dni, String nombre, String apellidos, double sueldoBase,
                     String turno, String area, int numEmpleados) {
         super(dni, nombre, apellidos, sueldoBase, turno);
        this.area = area;
          this.numEmpleados = numEmpleados;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    @Override
    public double getSueldoBase() {
        return sueldoBase * 1.10;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Encargado - " + dni + ", " + nombre + " " + apellidos +
                          ", Área: " + area + ", Empleados: " + numEmpleados +
                          ", Sueldo: " + getSueldoBase() + ", Turno: " + turno);
    }
}