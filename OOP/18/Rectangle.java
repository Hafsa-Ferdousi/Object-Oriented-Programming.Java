/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapepoly;

/**
 *
 * @author Asus
 */
public class Rectangle extends Polygon{
   private double l;
   private double w;
    public Rectangle(int numberOfSides,double l,double w) {
        super(numberOfSides);
        this.l=l;
        this.w=w;
    }

    @Override
    public double calcuatePerimeter() {
    return 2*l*w;
    }
    @Override
    public double calculateAra() {
    return l*w;
    }
    
}
