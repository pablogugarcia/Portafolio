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
public class Cliente {

    private GeneradorDatos gen;
    private int monto;
    private String nombre;
    private Tarjeta tar;

    public Cliente() {
        this.gen = new GeneradorDatos();
        this.monto = gen.montosAleatorios();// actualiza con un monto aleatorio inicial
        this.nombre = gen.nombresAleatorios(); // da el nombre al cliente

    }

    public void setRandomTarjeta(int i) {

        if (i % 2 == 0) {
            tar = new RedBus();
            tar.setTarjetaMonto(this.monto);

        } else {
            tar = new BoletoEducativo();
            tar.setTarjetaMonto(this.monto);
        }
    }

    public String tarjetaString() {
        return tar.toString();
    }

    public void descontar(int m) {

        tar.descViaje(m);
    }

    public Tarjeta getTipotarjeta() {

        return tar;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente: " + "\nnombre:  " + nombre + "\n" + tar.toString();
    }

}
