package ut08.bloque3.A12_vehiculos;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(new Coche("1234ABC", "Seat Ibiza", 4, true));
        lista.add(new Moto("5678DEF", "Yamaha", 2, "Roja"));

        lista.add(new Barco("Leonardo", "Titanic", 200, true));
        lista.add(new Submarino("SUBMAR", "CC", 50, 300));

        lista.add(new Avion("ABCD123456", "Boeing", 180, 10));
        lista.add(new Helicoptero("HELI123456", "Apache", 6, 4));

        lista.add(new Terrestre("9999ZZZ", "res", 4));
        lista.add(new Acuatico("OCEANO", "ca", 30));
        lista.add(new Aereo("AAAA1111", "te", 20));


        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir();
        }
    }
}