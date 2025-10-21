/*Crea la clase Coche con dos atributos: marca y modelo.

Crea dos constructores: Uno no toma parámetros y el otro sí. Los dos constructores inicializarán los atributos de la clase.

Crea también los getters y setters de ambos atributos.

Dentro de la funcion main, crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente. */

package ut02.bloque2;

public class Coche {
    // Atributos
    private String marca;
    private String modelo;

    // Constructor sin parámetros
    public Coche() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Constructor con parámetros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método main para probar
    public static void main(String[] args) {

        // Creo unobjeto con constructor sin parámetros
        Coche coche1 = new Coche();
        System.out.println("Coche 1: Marca = " + coche1.getMarca() + ", Modelo = " + coche1.getModelo());

        // Creo  objeto con constructor con parámetros
        Coche coche2 = new Coche("Toyota", "Corolla");
        System.out.println("Coche 2: Marca = " + coche2.getMarca() + ", Modelo = " + coche2.getModelo());
    }
}