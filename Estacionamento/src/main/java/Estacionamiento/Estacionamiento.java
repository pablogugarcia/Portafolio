package Estacionamiento;

class Estacionamiento {

    private Vehiculo lugares[] = new Vehiculo[10];
    private Vehiculo v = new Vehiculo() {
    };
    private int pisos = 2;
    private int contador = 0;
    private int espacios = 10;

    public Estacionamiento() {

    }

    public void guardarVehiculo(Vehiculo x) {

        for (int i = 0; i < espacios; i++) {

            if (x instanceof Auto) {
                this.lugares[contador] = x;
                contador++;
            } else if (x instanceof Moto) {
                this.lugares[contador] = x;
            } else
                System.out.println(" error");
            if (contador == 10) {
                contador = 0; // piso 2
            }

        }

    }
    public String mostrar (){

        return lugares [0].toString();
    }

}