
package main;

import java.util.LinkedList;

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
    public Client (){
        
    }
    
    public void createClient () {
        
       // if ()
       vehicle = new Car ("12312312","Toyota");
    }

    @Override
    public String toString() {
        return "Client{" + "\nid=" + id + "\n name=" + name + "\n plan=" + plan + "\n vehicle=" + vehicle + '}';
    }
    
    
    
    
}
