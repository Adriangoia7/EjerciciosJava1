package ut08.bloque0.A01_centroestudios;

public class AulaInformatica extends Aula {
    private int ordenadores;

    public AulaInformatica(int codigo, double longitud, double anchura, int ordenadores) {
        super(codigo, longitud, anchura);
        this.ordenadores = ordenadores;
    }

    public int getOrdenadores() {
        return this.ordenadores;
    }

    public int setOrdenadores(int Ordenadores) {
        return this.ordenadores = Ordenadores;
    }

    @Override
    public double calculoCapacidad(){
        return this.ordenadores*2;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Aula de informática: ");
        super.mostrarDatos();
    }
}