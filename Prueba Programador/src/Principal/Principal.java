/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    private static String resultado = "";

    public static void main(String[] args) {

        System.out.println(""
                + "   1-Crear un programa que imprima por consola los números del 1 al 100, uno por línea,\n"
                + "sólo que:\n"
                + " cuando el número sea múltiplo de 3 imprimir “coca” en lugar del número\n"
                + " cuando el número sea múltiplo de 5 imprimir “cola” en lugar del número\n"
                + " cuando el número sea múltiplo de 3 y 5 imprimir “coca cola” en lugar del\n"
                + "número\n"
                + "   2-Crear un programa que convierta un número en letras (por ejemplo: 45 en “cuarenta\n"
                + "y cinco”). El número será ingresado por consola y puede ser del -1000 al 1000.\n"
                + "   3- Exit");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                imprimirNumeros();

                break;
            case 2:
                traducirALetra();
                break;

        }
    }

    public static void imprimirNumeros() {

        for (int i = 1; i < 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Coca");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Cola");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Coca Cola");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void traducirALetra() {

        System.out.println("Ingrese un numero entre - 1000 y 1000 por favor: ");
        Integer numInt = 0;
        try {
            numInt = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error, debe ingresar un número!");
            return;
        }

        if (numInt > 1000 || numInt < -1000) {
            System.out.println("Error, debe ingresar un número entre 1000 y -1000!");
            return;
        }
        String numString = numInt.toString();
        if (numString.substring(0, 1).compareTo("-") == 0) {
            resultado += "menos ";
            numString = numString.substring(1, numString.length());
        }
        desarmarNumero(numString);
        System.out.println(resultado);

    }

    public static void desarmarNumero(String numero) {
        switch (numero.length()) {
            case 1:
                if (numero.compareTo("0") == 0 && resultado.length() == 0) {
                    resultado = "0";
                } else {
                    String res = retornarUnDecimal(numero.substring(0, 1));
                    if (res.length() != 0) {
                        if (resultado.length() != 0) {
                            resultado += " y ";
                        }
                        resultado += res;
                    }
                }
                break;
            case 2:
                String res = "";
                res = retornarDel10Al19(numero);
                if (res.length() != 0) {
                    resultado += " " + res;
                    return;
                } else {
                    resultado += " " + retornarDecena(numero.substring(0, 1));
                    desarmarNumero(numero.substring(1, numero.length()));
                }
                break;
            case 3:
                resultado += retornarcCentena(numero.substring(0, 1));
                String hola = numero.substring(1, numero.length());
                desarmarNumero(numero.substring(1, numero.length()));
                break;
            case 4:
                resultado += "mil";
                break;
            default:
                resultado += "....................ERROR, numero incorrecto";
                break;
        }

    }

    public static String retornarDecena(String decena) {
        switch (decena) {
            case "2":
                return "veinte";
            case "3":
                return "treinta";
            case "4":
                return "cuarenta";
            case "5":
                return "cincuenta";
            case "6":
                return "secenta";
            case "7":
                return "setenta";
            case "8":
                return "ochenta";
            case "9":
                return "noventa";
            default:
                return "";
        }
    }

    public static String retornarcCentena(String centena) {
        switch (centena) {
            case "1":
                return "ciento";
            case "2":
                return "docientos";
            case "3":
                return "trecientos";
            case "4":
                return "cuatrociento";
            case "5":
                return "quinientos";
            case "6":
                return "seicientos";
            case "7":
                return "setecientos";
            case "8":
                return "ochosientos";
            case "9":
                return "novecientos";
            default:
                return "";
        }
    }

    public static String retornarUnDecimal(String decena) {
        switch (decena) {
            case "1":
                return "Uno";
            case "2":
                return "dos";
            case "3":
                return "tres";
            case "4":
                return "cuatro";
            case "5":
                return "cinco";
            case "6":
                return "seis";
            case "7":
                return "siete";
            case "8":
                return "ocho";
            case "9":
                return "nueve";
            default:
                return "";
        }
    }

    public static String retornarDel10Al19(String decena) {
        switch (decena) {
            case "10":
                return "diez";
            case "11":
                return "once";
            case "12":
                return "doce";
            case "13":
                return "trece";
            case "14":
                return "catorce";
            case "15":
                return "quince";
            case "16":
                return "dieciséis";
            case "17":
                return "diecisiete";
            case "18":
                return "dieciocho";
            case "19":
                return "diecinueve";
            default:
                return "";
        }
    }
}
