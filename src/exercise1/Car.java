/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Car {
    int car_id;
    String make;
    String model;
    String year;


    Car(String make,String model,String year){
    this.make = make;
    this.model = model;
    this.year = year;

     System.out.println("New car has been added");
    }
}
