/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibn Yahya
 */
public class Griffin extends Animal implements RunInterface,FlyInterface,ShoutInterface{
       
    public Griffin() {
        this.name = "Griffin";
        this.habitat = "Land";
        
         System.out.println("Griffin can run fly and shout");
    }

    @Override
    public void eat(){
        System.out.println("Griffin is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Griffin is sleeping");
    }
    
    @Override
    public void run() {
         System.out.println("Griffin is running");
    }

    @Override
    public void fly() {
         System.out.println("Griffin is flying");
    }

    @Override
    public void shout() {
         System.out.println("Griffin is shouting");
    }
    
}
