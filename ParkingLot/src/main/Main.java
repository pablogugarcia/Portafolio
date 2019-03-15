/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author alejandra
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Park park;
    static Client client;
    static Reader reader;
    static Vehicle v;
    
    public static void main(String[] args) {

        client = new Client();
        int op = 0;
        do {
            System.out.println("Ingrese Opcion : ");
            System.out.println("\t1- Ingresar cantidad de lugares de su estacionamiento: ");
            System.out.println("\t2- Guardar Auto ");
            System.out.println("\t3- Cobrar y retirar auto ");
            System.out.println("\t4 -Buscar auto ");
            System.out.println("\t5-Salir ");

            try {
                op = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un numero porfavor");
                sc = new Scanner(System.in);
            };

            if (op == 1) {
                loadParkingData();
            } else if (op == 2) {

                opClient();
                client.toString();
                System.out.println("\nFuncionalidad proximamente disponible ");
                System.out.println("**********");
            } else if (op == 3) {
                System.out.println("\nFuncionalidad proximamente disponible ");
                System.out.println("**********");
            } else if (op == 4) {
                System.out.println("\nFuncionalidad proximamente disponible ");
                System.out.println("**********");
            } else {
                System.out.println("Ingrese opcion ");
            }

        } while (op != 5);
    }

    public static void loadParkingData() {
        try {
            System.out.println("Ingrese cantidad de lugares disponibles : ");
            int l = sc.nextInt();
            park = new Park(l);
        } catch (Exception e) {
            System.out.println("No es un numero, reingrese");
            sc = new Scanner(System.in);  // Se instancia de nuevo el objeto Scanner para limpiarlo del errory que no corte el programa
            loadParkingData();
        }

    }

    public static void opClient() {
        int o = 0;
        System.out.println("1- Cliente nuevo ");
        System.out.println("2- Cliente inscripto ");
        o=sc.nextInt();
        switch (o) {

            case 1:
                System.out.println("Ingrese nombre del cliente : ");
                String name = sc.nextLine();
                /*System.out.println(" Ingrese si subscribe o no ");
                boolean plan = sc.nextBoolean(); */
                boolean plan = true ;
                v = loadVehicle();
                client = new Client(name, plan,v);
                reader.createClient(client);
                break;
            case 2:
                System.out.println("Ingrese numero de id: ");
                reader.findClient(sc.nextInt());
                // TODO : metodo para buscar auto y capturarlo 
                break;
            default:
                System.out.println("No existe esa opcion reingrese");

        }

    }

    public static Vehicle loadVehicle() {

        System.out.println("");
        String marca = "";
        String matricula = "";
        int op = 0;

        System.out.println("Ingrese matricula: ");
        matricula = sc.nextLine();
        System.out.println("Ingrese marca : ");
        marca = sc.nextLine();
        System.out.println("Ingrese 1 para Auto y 2 para moto");
       try { if (op == 1) {
             v = new Car(matricula, marca);

        } else if (op == 2) {

             v = new Motorcycle(matricula, marca);
        } }catch (Exception e){
            System.out.println("Error ");
        }
        return v;

    }

}
