/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Point {
    int X;
    int Y;

    Point(int X,int Y){
        this.X = X;
        this.Y = Y;
    }

    @Override
    public String toString(){
        return "(" + X + "," + Y + ")";
    }
}
