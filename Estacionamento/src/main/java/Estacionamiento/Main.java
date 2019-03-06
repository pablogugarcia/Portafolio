package Estacionamiento;

/**
 * Hello world!
 */
public class Main {

    static private Estacionamiento e = new Estacionamiento();
    static private Vehiculo v = new Vehiculo(2131231, 1, "audi") {
    };

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        e.guardarVehiculo(v);

        System.out.println(e.mostrar());
    }
}
