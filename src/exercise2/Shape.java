/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public abstract class Shape {
    
    int numberOfCorners;
    double size;
    Point[] reference;
    
    public Shape(int numberOfCorners,int size){
        this.numberOfCorners = numberOfCorners;
        this.size = size;
        this.reference = new Point[numberOfCorners];
    }
    
    public void shapeinfo(){
    
    }
    
    public String getCorners(){
        String corners = "";
        
        for(int number=0; number < numberOfCorners; number++){
            corners += reference[number].toString();
        }
        return corners;
    }
    
    public void setCorners(Point reference[]){
        this.reference = reference;
    }
        
    
}
