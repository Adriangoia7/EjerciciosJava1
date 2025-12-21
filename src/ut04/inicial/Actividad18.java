package ut04.inicial;

public class Actividad18 {

    private String nombre;
    private double precio;
    private int stock;

    public Actividad18(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public int getStock() {
        return stock;
    }



    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void main(String[] args) {

        Actividad17[] productos = new Actividad17[3];
  
        Actividad17[] copiaProductos = new Actividad17[3];
        for (int i = 0; i < productos.length; i++) {
            copiaProductos[i] = new Actividad17(
                productos[i].getNombre(),
                productos[i].getPrecio(),
                productos[i].getStock()
            );
        }

            copiaProductos[0].setNombre("CAMBIADO");
             copiaProductos[0].setStock(999);

        System.out.println("\nPRODUCTOS ORIGINALES");
        for (Actividad17 p : productos) {
            p.mostrarInfo();
        }
    
    }



    
}
