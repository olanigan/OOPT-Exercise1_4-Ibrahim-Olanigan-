/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Crocodile extends Animal{
	
    public Crocodile(){
            this.name = "Crocodile";
            this.family = "Reptile";
            this.habitat = "Water";
    }

    @Override
    public void eat(){
            System.out.println("Crocodile is eating");
    }

    @Override
    public void sleep(){
            System.out.println("Crocodile is sleeping");
    }
}
