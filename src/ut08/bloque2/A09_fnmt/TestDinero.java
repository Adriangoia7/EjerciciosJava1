package ut08.bloque2.A09_fnmt;

public class TestDinero {

    public static void main(String[] args) {

        Moneda m1 = new Moneda(2.0, 2020, 25.73, 8.5);
        Moneda m2 = new Moneda(1.0, 2018, 23.25, 7.5);

        Billete b1 = new Billete(10.0, 2019, 67.0, 127.0);
        Billete b2 = new Billete(20.0, 2021, 67.0, 133.0);


        System.out.println(m1);
        System.out.println(m2);

        System.out.println();

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(m1.equals(m2));
        System.out.println(b1.equals(b2));
    }
}