/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cage[] cages = new Cage[5];
        cages[0] = new Cage(0, new Eagle());
        cages[1] = new Cage(1, new Lion());
        cages[2] = new Cage(2, new Tortoise());
        cages[3] = new Cage(3, new Lizard());
        cages[4] = new Cage(4, new Crocodile());
        
        Zoo zoo = new Zoo(cages);
        zoo.cageSearch(1);
        zoo.cageSearch(3);
        zoo.cageSearch("Eagle");
        zoo.cageSearch("Lion");
        zoo.feedAnimals();
    }
}
