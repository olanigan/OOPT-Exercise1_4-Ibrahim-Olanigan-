/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Tortoise extends Animal{
	
    public Tortoise(){

            this.name = "Tortoise";
            this.family = "Reptile";
            this.habitat = "Land";
    }

    @Override
    public void eat(){
            System.out.println("Tortoise is eating");
    }

    @Override
    public void sleep(){
            System.out.println("Tortoise is sleeping");
    }
}
