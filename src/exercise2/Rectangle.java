/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Rectangle extends Shape{
    int width;
    int height;
    
    Rectangle(int width, int height){
        //
        super(4,0);
        this.width = width;
        this.height = height;
        this.reference = new Point[4];
    }
    
    @Override
    public void shapeinfo(){
        System.out.println("This shape is a Rectangle and has four corners:" + getCorners() +"\n");
    }
}
