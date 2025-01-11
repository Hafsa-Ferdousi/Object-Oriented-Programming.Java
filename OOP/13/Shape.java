/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labshape;

/**
 *
 * @author Asus
 */
abstract class Shape {
    double area;
    
    public double getArea(){
        return area;
    }
    public void setArea(double area){
       this.area=area; 
    }
    
    public abstract void RectangleArea( double breadth, double length);
     public abstract void SquareArea( double side);
     public abstract void CircleArea( double radius);
    
    
}
