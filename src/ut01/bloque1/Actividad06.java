package ut01.bloque1;

    public class Actividad06 {
    public static void main(String[] args) {
        String nombre = "Adrian", apellidos = "Goya Sferle", poblacion = "Alfarp", iniciales = "A G";
        char inicialNombre = 'A';
        int edad = 20;
        boolean apruebopro = true;
        double horasestudio = 1.25;

        System.out.println(
            "Nombre: " + nombre + "\n" +
            "Inicial del nombre: " + inicialNombre + "\n" +
            "Apellidos: " + apellidos + "\n" +
            "Iniciales: " + iniciales + "\n" +
            "Población: " + poblacion + "\n" +
            "Edad: " + edad + "\n" +
            "¿Cree que va a aprobar? " + apruebopro + "\n" +
            "Horas semanales de estudio: " + horasestudio
        );
    }

}