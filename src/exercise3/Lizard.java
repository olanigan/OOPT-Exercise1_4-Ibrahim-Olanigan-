/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Lizard extends Animal{
    /*Constructor method, No parameters*/
    public Lizard(){

            this.name = "Lizard";
            this.family = "Reptile";
            this.habitat = "Land";
    }

    @Override
    public void eat(){
            System.out.println("Lizard is eating");
    }

    @Override
    public void sleep(){
            System.out.println("Lizard is sleeping");
    }
}
