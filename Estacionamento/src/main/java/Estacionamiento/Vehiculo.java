package Estacionamiento;

abstract class Vehiculo {

    private int matricula;
    private int tipo;
    private String marca;

    public Vehiculo (int m , int t, String mar){
        this.matricula = m;
        this.tipo = t;
        this.marca = mar;

    }


    public Vehiculo() {
    }

}