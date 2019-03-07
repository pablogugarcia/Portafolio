/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import javax.swing.*;

/**
 * Consigna : simular pagos de clientes , tarjeta red bus , boleto educativo
 * gratuito ,
 *
 * @author usuario
 */
public class Principal {

    static Cliente cli[];
    static Scanner sc = new Scanner(System.in);
    static GeneradorDatos gen = new GeneradorDatos(); // genera datos aleatorios

    public static void main(String[] args) {

        String op = "";
        do {
            op = JOptionPane.showInputDialog(null, "Ingrese una opcion :\n a.Generar datos\n b.Descontar viajes del boleto educativo\n c.descontar viajes redbus\n d.mostrar\n e.exit ");

            if (op.equals("a")) {
                cargar();
                mostrar();

            } else if (op.equals("b")) {
                String desbeg = JOptionPane.showInputDialog(null, "Ingrese cantidad de viajes a desconar : ");
                int descuentobeg = Integer.parseInt(desbeg);

                for (int i = 0; i < cli.length; i++) {
                    if (cli[i].getTipotarjeta() != null && cli[i].getTipotarjeta() instanceof BoletoEducativo) {

                        cli[i].descontar(descuentobeg);

                    }
                }

            } else if (op.equals("c")) {

                /* String cual=JOptionPane.showInputDialog(null, "Seleccione cual cliente: ");
                
                int c= Integer.parseInt(cual);
                int i;
                for()
                switch(c){
                   
                    break;
                    default:
                }
                 */
                String des = JOptionPane.showInputDialog(null, "Ingrese un monto a descontar: ");
                int descuento = Integer.parseInt(des);

                for (int i = 0; i < cli.length; i++) {
                    if (cli[i].getTipotarjeta() != null && cli[i].getTipotarjeta() instanceof RedBus) {

                        cli[i].descontar(descuento);

                    }
                }
            } else if (op.equals("d")) {
                mostrar();

            } else if (op.equals("e")) {

                // System.exit(0); Salir
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida: ");
            }
        } while (!op.equals("e"));

    }

    public static void cargar() {
        //System.out.println("  Clientes : "); // ingrese n clientes
        String m = JOptionPane.showInputDialog(null, "Ingrese la cantidad de clientes: ");

        int n = Integer.parseInt(m);
        cli = new Cliente[n];

        for (int i = 0; i < cli.length; i++) {

            cli[i] = new Cliente(); // instanciamos el objeto para setear los atributos aleatorios
            cli[i].setRandomTarjeta(i); // hace un "random" pares redbus e impares beg

        }

    }

    public static void mostrar() {

        // Se crea un ciclo para mantener actualizado el arreglo y los datos que contiene cuando se usa la funcion .descontar
        Cliente cli2[];
        cli2 = new Cliente[cli.length];
        for (int i = 0; i < cli.length; i++) {
            cli2[i] = cli[i];
        }
        cli = cli2;

        JOptionPane.showMessageDialog(null, cli);

    }
    /*
	 * En el programa se va a ingresar una cantidad de viajes y se va a descontar
	 * del monto de cada cliente dependiendo el tipo de tarjeta que tenga
     */

}
