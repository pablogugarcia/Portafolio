/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *Lector que almacena clientes y maneja formas de pago 
 */
public class Reader {
    
    private LinkedList<Client> cli = new LinkedList<>();
    private Client client;
    private Vehicle vehicle ; 
    
    public Reader() {
    }
    
    public void createClient(Client client) {
        
        cli.add(client);
        
    }

    public Client findClient(int id) {
        
        return cli.get(id);
    }
    
    public void toAssignVehicle () {
        
    }
    
}
