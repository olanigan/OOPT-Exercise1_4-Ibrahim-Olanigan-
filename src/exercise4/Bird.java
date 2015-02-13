/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibn Yahya
 */
public class Bird extends Animal implements FlyInterface,LayInterface{
    
    public Bird() {
        this.name = "Bird";
        this.habitat = "Tree";
        
        System.out.println("Bird can fly and lay eggs");
    }
    
    @Override
    public void fly() {
         System.out.println("Bird is flying");
    }

    @Override
    public void layEgg() {
         System.out.println("Bird is laying eggs");
    }
    
    @Override
    public void eat(){
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Bird is sleeping");
    }
    
}
