package ut08.A01_centroestudios;

public class AulaMusica extends Aula {
    private boolean piano;

    public AulaMusica(int codigo, double longitud, double anchura, boolean piano) {
        super(codigo, longitud, anchura);
        this.piano = piano;
    }

    public boolean getPiano() {
        return this.piano;
    }

    public void setPiano(boolean piano) {
        this.piano = piano;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Aula de música: ");
        super.mostrarDatos();
    }

   
}