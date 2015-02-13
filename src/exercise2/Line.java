/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Line extends Shape{
    
    Line(int size){
       super(2,size);
    }
    
    @Override
    public void shapeinfo(){
        System.out.println("This shape is a Line and has 2 corners" + getCorners() +"\n");
    }
}
