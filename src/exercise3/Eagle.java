/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Eagle extends Animal{

    public Eagle() {
        this.name = "Eagle";
        this.family = "Bird";
        this.habitat = "Tree";
        
    }

    @Override
    public void eat(){
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Eagle is sleeping");
    }
    
}
