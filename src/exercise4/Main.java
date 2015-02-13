/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cage[] cages = new Cage[5];
        cages[0] = new Cage(0, new Bird());
        cages[1] = new Cage(1, new Griffin());
        cages[2] = new Cage(2, new Horse());
        cages[3] = new Cage(3, new Pegasus());
        cages[4] = new Cage(4, new Platypus());
        
        Zoo zoo = new Zoo(cages);
        zoo.cageSearch(1);
        zoo.cageSearch(3);
        zoo.cageSearch("Horse");
        zoo.cageSearch("Griffin");
        zoo.feedAnimals();
    }
}
