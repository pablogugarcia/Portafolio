/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author alejandra
 */
public abstract class Vehicle {
    
    private String matricula;
    private String marca;
    

    Vehicle(String matricula,String marca) {
        this.marca = marca;
       
        this.matricula=matricula;
  
    }
    
    
}
