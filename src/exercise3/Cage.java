/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Cage {
    int cageNumber;
    Animal animal;


    Cage(int cageNumber,Animal animal){
        this.cageNumber = cageNumber;
        this.animal = (Animal) animal;
    }

    public void feedAnimal(){
        animal.eat();
    }
}
