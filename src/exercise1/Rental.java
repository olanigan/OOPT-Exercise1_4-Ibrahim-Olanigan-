/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Rental {
    
    Customer customer;
    Car car;
    String startDate;
    String stopDate;
    
    Rental(Customer customer, Car car, String startDate, String stopDate){
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.stopDate = stopDate;
    }

    public void rentcar(){
	System.out.println("New reservation has been made");
	}
    
    @Override
     public String toString(){
         String reserve = "\nRESERVATION: \n" +
                        "Customer Information: " + customer.name + ", " + customer.phonenumber + ", " + customer.address + ", " + customer.state + "\n"
                         + "Car Information: " + car.make + ", " + car.model + ", " + car.year + "\n"
                         + "Start Date: " + startDate + ". Stop Date: " + stopDate;
         
         
         return reserve;
     }
}
