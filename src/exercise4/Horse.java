/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Horse extends Animal implements RunInterface{
    
    public Horse(){
       this.name = "Horse";
       this.habitat = "Land";
       
       System.out.println("Horse can run");
    }
    
    @Override
    public void run(){
        System.out.println();
    }
    
    @Override
    public void eat(){
        System.out.println("Horse is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Horse is sleeping");
    }
    
    
}
