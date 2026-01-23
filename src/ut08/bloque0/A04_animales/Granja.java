package ut08.A04_animales;

public class Granja {
    private Animal[] animales;

    public Granja() {
        animales = new Animal[3];
        animales[0] = new Vaca("Lola", 5);
        animales[1] = new Cerdo("Lolo", 3);
        animales[2] = new Gallina("Lolero", 2);
    }

    public void hacerSonidos() {
        System.out.println("sonidos de la granja:");
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }

    public void mostrarDatos() {
        System.out.println("datos de la granja:");
        for (Animal animal : animales) {
            animal.mostrarDatos();
        }
    }
}