package ut01.bloque3;
public class actividad12 {
    public static void main(String[] args) {
     
     // Pongo la cabecera de la tabla de verdad
     System.out.println(" A\t B\t A O B");
     System.out.println("-----------------------");

     // En la fila 1 coloco: A = false, B = false
     boolean A = false;
     boolean B = false;
     System.out.println(A + "\t" + B + "\t" + (A || B));

     // En la fila 2 pongo: A = false, B = true
     A = false;
     B = true;
     System.out.println(A + "\t" + B + "\t" + (A || B));

     // En la fila 3 coloco: A = true, B = false
     A = true;
     B = false;
     System.out.println(A + "\t" + B + "\t" + (A || B));

     // Y por último en la fila 4 coloco: A = true, B = true
     A = true;
     B = true;
     System.out.println(A + "\t" + B + "\t" + (A || B));

    }
}