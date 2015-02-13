/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Zoo {
    
    int numberOfCages;
    Cage[] cages;
        
    public Zoo(Cage[] cages) {
        this.numberOfCages = cages.length;
        this.cages = new Cage[numberOfCages];
        this.cages = cages;
        
        System.out.println("Numbe of Cages : " +  numberOfCages);
    }
    
    
    public void cageSearch(int cageNumber){
        String animal = cages[cageNumber-1].animal.name;
        System.out.println("The animal in Cage " + cageNumber + " is " + animal);
	}
    
     public void cageSearch(String animal){
         for(int index=0; index < numberOfCages; index++){
             if(animal.equals(cages[index].animal.name)){
                 System.out.println(animal + " is in  Cage " + (index+1));
                 return;
             }
         }
         System.out.println("There is no such animal in the zoo");
     }
     
    public void feedAnimals(){
	for(int index=0; index < numberOfCages; index++){
            cages[index].feedAnimal();
        }
}
        
}
