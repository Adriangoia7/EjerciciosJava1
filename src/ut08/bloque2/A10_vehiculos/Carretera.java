package ut08.bloque2.A10_vehiculos;

public class Carretera {

    private Vehiculo[] vehiculos;
    private int total;


    public Carretera(int max) {
        vehiculos = new Vehiculo[max];
        total = 0;
    }


    public void añadirVehiculo(Vehiculo v) {
        if (total < vehiculos.length) {
            vehiculos[total] = v;
            total++;
        }
    }


    public void acelerarTodos() {
        for (int i = 0; i < total; i++) {
            vehiculos[i].acelerar();
        }
    }


    public void frenarTodos() {
        for (int i = 0; i < total; i++) {
            vehiculos[i].frenar();
        }
    }


    public void mostrarVelocidades() {
        for (int i = 0; i < total; i++) {
            System.out.println(vehiculos[i].getVelocidad());
        }
    }
}