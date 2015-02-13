/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibn Yahya
 */
public class Pegasus extends Animal implements RunInterface,FlyInterface{
    
    public Pegasus() {
        this.name = "Pegasus";
        this.habitat = "Sky";
        
        System.out.println("Pegasus can run and fly");
    }
    
    @Override
    public void run() {
        System.out.println("Pegasus is running");
    }

    @Override
    public void fly() {
        System.out.println("Pegasus is flying");
     }
    
    @Override
    public void eat(){
        System.out.println("Pegasus is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Pegasus is sleeping");
    }
    
}
