/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Lion extends Animal{
    
    public Lion(){
        this.name = "Lion";
        this.family = "Cat";
        this.habitat = "Land";
    }
    
    @Override
    public void eat(){
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep(){
            System.out.println("Lion is sleeping");
    }
}
