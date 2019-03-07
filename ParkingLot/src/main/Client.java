/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author alejandra
 */
public class Client {
    
    private int id ;
    private String name ;
    private boolean plan ;
    private Vehicle vehicle; 

    public Client(String name, boolean plan,Vehicle vehicle) {
        this.id ++;
        this.name = name;
        this.plan = plan;
        this.vehicle = vehicle; 
    }
    
    public void createClient () {
        
       // if ()
    }

    @Override
    public String toString() {
        return "Client{" + "\nid=" + id + "\n name=" + name + "\n plan=" + plan + "\n vehicle=" + vehicle + '}';
    }
    
    
    
    
}
