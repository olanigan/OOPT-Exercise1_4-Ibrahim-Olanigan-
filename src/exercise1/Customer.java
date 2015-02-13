/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Customer {
    String customer_id;
    String name;
    String phonenumber;
    String address;
    String state;

    Customer(String name, String phonenumber, String address, String state){
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.state = state;
        
        System.out.println("New customer has been added");
    }
}
