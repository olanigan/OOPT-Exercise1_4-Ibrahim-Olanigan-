/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Circle extends Shape{
    double radius = 2.0;
    public Circle(int radius){
        super(0, radius);
        this.size = radius;
    }
    
    @Override
    public void shapeinfo(){
        System.out.println("This shape is a Circle and it has no corners\n");
    }
}
