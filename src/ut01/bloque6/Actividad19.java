package ut01.bloque6;

mport java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {

    // Creo un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);
        
    // Solicito la medida en pies
    System.out.print("Pon la medida en pies: ");
    double pies = scanner.nextDouble();
    
    // Conversión de pies a yardas, pulgadas, centímetros y metros
    double yardas = pies / 3.0;
    double pulgadas = pies * 12.0;
    double centimetros = pulgadas * 2.54;
    double metros = centimetros / 100.0;
    
    // Pongo los resultados
    System.out.println(pies + " pies equivalen a:");
    System.out.println(yardas + " yardas");
    System.out.println(pulgadas + " pulgadas");
    System.out.println(centimetros + " centímetros");
    System.out.println(metros + " metros");

    scanner.close();

    }
}