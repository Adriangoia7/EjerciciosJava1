package ut08.bloque1.A07_empleados;

public class TestEmpleados {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado("Ana", "23423535A", 1200);
        empleados[1] = new Gerente("Luis", "23432246B", 2000, 5000);
        empleados[2] = new Interno("Sara", "23423443C", 900, 6);

        for (Empleado e : empleados) {
            System.out.println(e.calcularSueldoAnual());
        }

        Gerente g = (Gerente) empleados[1];
        System.out.println(g.calcularSueldoBono());
    }
}