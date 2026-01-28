package ut08.bloque2.A08_videojuegos;

public class TestJuego {

    public static void main(String[] args) {

        JuegoEnAlquiler j1 = new JuegoEnAlquiler(
                "FIFA 27", "EA", 2026, 70.0, 3, 7
        );

        JuegoEnVenta j2 = new JuegoEnVenta(
                "GTA V", "Rockstar", 2013, 50.0, 2
        );


        System.out.println(j1);
        j1.alquilar();
        System.out.println(j1);
        j1.devolver();
        System.out.println(j1);


        System.out.println(j2);
        j2.vender();
        System.out.println(j2);
    }
}