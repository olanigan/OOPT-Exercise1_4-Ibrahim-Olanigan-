/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibn Yahya
 */
public class Platypus extends Animal implements RunInterface,ShoutInterface,LayInterface{
    
    public Platypus() {
        this.name = "Platypus";
        this.habitat = "Water";
        
        System.out.println("Platypus can run, shout and lay eggs");
    }
    
    @Override
    public void run() {
        System.out.println("Platypus is running");
     }

    @Override
    public void shout() {
        System.out.println("Platypus is shouting");
    }

    @Override
    public void layEgg() {
        System.out.println("Platypus is laying eggs");
    }
    
    @Override
    public void eat(){
        System.out.println("Platypus is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Platypus is sleeping");
    }
    
}
