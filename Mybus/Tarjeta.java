/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author usuario
 */
public abstract class Tarjeta {

    private int saldo;
    private int cantidadViajes;

    public Tarjeta() {

    }

    public Tarjeta(int saldo) {
        super();
        this.saldo = saldo;
    }

    public abstract String mostrarViajes();

    public abstract void setTarjetaMonto(int m);

    public abstract int descViaje(int c);
    
    public abstract int agregar();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCantidadViajes() {
        return cantidadViajes;
    }

    public void setCantidadViajes(int cantidadViajes) {
        this.cantidadViajes = cantidadViajes;
    }

}
