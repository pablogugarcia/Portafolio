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
public class RedBus extends Tarjeta {

    private int viajes;
    private int moneda;

    public RedBus(int saldo) {
        super(saldo);
        if (saldo > -15) {
            viajes = saldo;
        } else {
            saldo = 0;
        }
    }
    
    public void serMoneda(int moneda){
        this.moneda = moneda;
    }

    public RedBus() {
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

    @Override
    public String mostrarViajes() {
        return "\n" + viajes;
    }

    @Override
    public int descViaje(int cant) {

        int montoRestante = viajes - cant;
        viajes = montoRestante;
        if (viajes <= -15) {
            viajes = 0;
            return 0;

        } else {
            return montoRestante;
        }
    }

    @Override
    public void setTarjetaMonto(int m) {
        if (m > -15) {
            viajes = m;
        } else {
            m = 0;
        }
    }

    @Override
    public int agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "RedBus" + "\nmonto para viajar : " + viajes + " pesos";
    }

}
