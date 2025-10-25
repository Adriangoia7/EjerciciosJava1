package ut02.bloque5;

public class TestMoto {
    public static void main(String[] args) {
        Moto miMoto = new Moto();
        System.out.println(miMoto.getVelocidad());
        miMoto.acelera(30);
        System.out.println(miMoto.getVelocidad());
        miMoto.acelera(50);
        System.out.println(miMoto.getVelocidad());
        miMoto.frena(20);
        System.out.println(miMoto.getVelocidad());
        miMoto.frena(100);
        System.out.println(miMoto.getVelocidad());
    }
}