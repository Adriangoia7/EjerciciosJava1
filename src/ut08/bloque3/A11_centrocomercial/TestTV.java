package ut08.bloque3.A11_centrocomercial;

public class TestTV {

    public static void main(String[] args) {

        TvTubo tv1 = new TvTubo("Sony", "Siuu", 199.99, 21, 420);
        TvTubo tv2 = new TvTubo("Philips", "clasicoo", 149.99, 19, 380);

        TvLcd tv3 = new TvLcd("Samsung", "laMejor", 399.99, 32, 800, 600);
        TvLcd tv4 = new TvLcd("LG", "GL", 499.99, 40, 1920, 1080);


        System.out.println(tv1);
        System.out.println(tv2);

        System.out.println();

        System.out.println(tv3);
        System.out.println(tv4);


        System.out.println();

        System.out.println(tv1.equals(tv2));
        System.out.println(tv3.equals(tv4));
    }
}