package ut01.bloque1;

public class activ13 {
    public static void main(String[] args) {
        int num = 4;
        num %= 7 * num % 3 * 3;
        System.out.println(num);
    }
}
// el resultado es 1