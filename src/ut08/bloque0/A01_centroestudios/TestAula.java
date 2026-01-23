package ut08.A01_centroestudios;

public class TestAula {
    public static void main(String[] args) {
        Aula normal = new Aula(1, 3.4, 5.6);
        AulaMusica aulamusica = new AulaMusica(2, 4.5, 4, true);
        AulaInformatica aulainformatica = new AulaInformatica(3, 3.4, 6, 20);

        System.out.println(normal);
        System.out.println(aulamusica);
        System.out.println(aulainformatica);

        Aula instituto[] = new Aula[3];
        instituto[0] = new Aula(4, 4.5, 4.5);
        instituto[1] = new AulaInformatica(5, 10, 5.6, 25);
        instituto[2] = new AulaMusica(6, 7.7, 6.5, false);
        
        for (Aula a : instituto) {
            a.mostrarDatos();
        }

        for (int i = 0; i < instituto.length; i++) {
            instituto[i].mostrarDatos();
        }
    }
}