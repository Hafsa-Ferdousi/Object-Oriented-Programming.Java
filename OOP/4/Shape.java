/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract3;

abstract class Shape {
    protected double area;

 public double getArea(){
    return area; 
 }
 
 public void setArea(double area){
     this.area=area;
 }
  public abstract void RectangleArea(double length,double breadth);
  public abstract void SuareArea(double side);
  public abstract void CircleArea(double radius);
}