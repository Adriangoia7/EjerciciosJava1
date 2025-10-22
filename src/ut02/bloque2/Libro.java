package ut02.bloque2;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int ejemplaresTotales;
    private int ejemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.editorial = "";
        this.ejemplaresTotales = 0;
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, String editorial, int ejemplaresTotales, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public boolean prestamo() {
        if (ejemplaresPrestados < ejemplaresTotales) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

    public boolean perdido() {
        if (ejemplaresTotales > 0) {
            ejemplaresTotales--;
            if (ejemplaresPrestados > ejemplaresTotales) {
                ejemplaresPrestados = ejemplaresTotales;
            }
            return true;
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Ejemplares totales: " + ejemplaresTotales);
        System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
    }

    public static void main(String[] args) {
        Libro libroInformatica1 = new Libro("Java Básico", "Ana Asins", "McGraw-Hill", 3, 0);
        System.out.println(libroInformatica1.getTitulo());
        libroInformatica1.setEditorial("Anaya");
        System.out.println(libroInformatica1.prestamo());
        System.out.println(libroInformatica1.prestamo());
        System.out.println(libroInformatica1.getEjemplaresPrestados());
        System.out.println(libroInformatica1.devolucion());
        System.out.println(libroInformatica1.getEjemplaresPrestados());
        System.out.println(libroInformatica1.perdido());
        System.out.println(libroInformatica1.getEjemplaresTotales());
        libroInformatica1.mostrarDatos();
    }
}
