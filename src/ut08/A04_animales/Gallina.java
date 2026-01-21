package ut08.A04_animales;

public class Gallina extends Animal {

    public Gallina(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " kikirikí");
    }
}