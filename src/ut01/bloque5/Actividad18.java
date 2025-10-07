package ut01.bloque5;

public class Actividad18 {
    public static void main(String[] args) {

    double realLlarg = 3000000000.0;
    // Asignación incorrecta. ¿Un real tiene decimales, no?
    long enterLlarg = (long) realLlarg;
    // Asignación incorrecta. ¿Un entero largo tiene un rango mayor que un entero, no?
    int enter = (int) enterLlarg;
    System.out.println (enter);

    }    
}
/* 
1. El programa sigue funcionando aunque pongas un número con decimales en realLlarg. 
Lo único que pasa es que al convertirlo a long se pierde la parte decimal, 
es decir, se queda solo con la parte entera.

2. Si pones un número muy grande, más de lo que puede guardar un int, 
el programa también se ejecuta, pero el resultado sale raro o incorrecto, 
porque el número se pasa del límite que puede tener un int.
*/