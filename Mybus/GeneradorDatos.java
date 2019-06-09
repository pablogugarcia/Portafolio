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
public class GeneradorDatos {

    private int cantidad;
    private int montos;
    private String nombres;

    public GeneradorDatos() {
    }

    public String nombresAleatorios() {

        String[] nombres = {"Andrea", "David", "Baldomero", "Franchesco", "Baldwin", "Pablo", "Barry", "Moro", "Bartolomé", "Baruc", "Baruj",
            "Naira", "Cándida", "Canela", "Naira", "Carina", "Carisa", "Caritina", "Carlota"};
        String[] apellidos = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo", "Carion", "Castiyo", "Castorena",
            "Castro", "Garcia", "Grangenal", "Coppari", "Grasia", "Castillo", "Grigalva"};

        this.nombres = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " " + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
        return this.nombres;
    }

    public int montosAleatorios() {

        montos = (int) (Math.random() * 1000) + 1;
        return montos;
    }
}
