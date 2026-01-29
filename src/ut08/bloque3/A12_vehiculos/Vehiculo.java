package ut08.bloque3.A12_vehiculos;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;


    public Vehiculo(String m, String mo) {
        matricula = m;
        modelo = mo;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }


    public abstract void imprimir();
}