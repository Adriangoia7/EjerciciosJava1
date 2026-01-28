package ut08.bloque2.A10_vehiculos;

public class TestVehiculos {

    public static void main(String[] args) {

        Carretera c = new Carretera(3);

         Coche coche1 = new Coche();
         Moto moto1 = new Moto();
         Coche coche2 = new Coche();


        c.añadirVehiculo(coche1);
        c.añadirVehiculo(moto1);
        c.añadirVehiculo(coche2);


        c.acelerarTodos();
        c.acelerarTodos();

        c.mostrarVelocidades();

        System.out.println();

        c.frenarTodos();
        c.mostrarVelocidades();
    }
}