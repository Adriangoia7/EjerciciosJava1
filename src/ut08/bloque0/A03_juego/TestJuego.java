package ut08.A03_juego;

public class TestJuego {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Moneda moneda = new Moneda();

        System.out.println("lanzamiento");
        dado.lanzar();      
        dado.lanzar();      
        moneda.lanzar();    
        moneda.lanzar();    

        System.out.println("\ndatos");
        dado.mostrarDatos();
        moneda.mostrarDatos();
    }
}