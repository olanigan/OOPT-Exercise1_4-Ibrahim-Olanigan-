/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Main {
    
     public static void main1(String[] args) {
        
         Circle circle1 = new Circle(10);
         circle1.shapeinfo();
         
         Rectangle rect = new Rectangle(10,10);
         Point[] rectCorners =  new Point[4];
         rectCorners[0] = new Point(5,5);
         rectCorners[1] = new Point(5,15);
         rectCorners[2] = new Point(15,5);
         rectCorners[3] = new Point(15,15);
         rect.setCorners(rectCorners);
         rect.shapeinfo();
         
         Line line = new Line(10);
         Point[] lineCorners = new Point[5];
         lineCorners[0] = new Point(15,20);
         lineCorners[1] = new Point(20,20);
         line.setCorners(lineCorners);
         line.shapeinfo();
    }
}
