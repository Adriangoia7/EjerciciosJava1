package ut08.A02_trabajadores;

public class Empleado {
    protected String dni, nombre, apellidos, turno;
    protected double sueldoBase;

    public Empleado(String dni, String nombre, String apellidos, double sueldoBase, String turno) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.turno = turno;
    }

    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellidos() {
        return apellidos;
    }



    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public String getTurno() {
        return turno;
    }



    public void setTurno(String turno) {
        this.turno = turno;
    }



    public double getSueldoBase() {
        return sueldoBase;
    }



    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + dni + ", " + nombre + " " + apellidos +
                          ", Sueldo: " + getSueldoBase() + ", Turno: " + turno);
    }    
}