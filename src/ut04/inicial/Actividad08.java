package ut04.inicial;

public class Actividad08 {

    public static boolean sonIguales(String[] v1, String[] v2) {
        if (v1.length != v2.length) {
            return false;
        }

        for (int i = 0; i < v1.length; i++) {
            if (!v1[i].equals(v2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] array1 = {"Hola", "Mundo", "Java"};
        String[] array2 = {"Hola", "Mundo", "Java"};
        String[] array3 = {"Hola", "Mundo", "Python"};

        System.out.println("Array 1 y 2 son iguales: " + sonIguales(array1, array2));
        System.out.println("Array 1 y 3 son iguales: " + sonIguales(array1, array3));
    }
}