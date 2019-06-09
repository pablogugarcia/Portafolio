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
public class BoletoEducativo extends Tarjeta {

    private int cantidadViajes;

    public BoletoEducativo(int saldo) {
        super(saldo);
        if (saldo > -15) {
            cantidadViajes = saldo / 15;
        } else {
            cantidadViajes = -1;
        }

    }

    public BoletoEducativo() {
    }

    public int getCantidadViajes() {
        return cantidadViajes;
    }

    public void setCantidadViajes(int cantidadViajes) {
        this.cantidadViajes = cantidadViajes;
    }

    @Override
    public String mostrarViajes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int descViaje(int cant) {

        int viajesRestantes = cantidadViajes - cant;
        cantidadViajes = viajesRestantes;
        if (cantidadViajes <= 0) {
            cantidadViajes=0;
            return 0;
        } else {
            return viajesRestantes;
        }
    }

    @Override
    public String toString() {
        return "BoletoEducativo: " + "\ncantidadViajes: " + cantidadViajes;
    }

    @Override
    public void setTarjetaMonto(int m) {
        if (m > -15) {
            cantidadViajes = m / 15;
        } else {
            cantidadViajes = -1;
        }
    }

    @Override
    public int agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
