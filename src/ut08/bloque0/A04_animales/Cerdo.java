package ut08.bloque0.A04_animales;

public class Cerdo extends Animal {

    public Cerdo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + "oin oinh");
    }
}