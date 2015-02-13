/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Main {
    
    public static void main(String[] args) {
        
         Customer customer1 = new Customer("James Dale","01245","7 Wilkins road","Vaasa");
         Car car1 = new Car("Audi","200","2005");
         
         Rental first = new Rental(customer1,car1,"04.02.2015","07.02.2015");
         first.rentcar();
         String reservation = first.toString();
         System.out.println(reservation);
    }
}
