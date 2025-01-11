/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract3;

/**
 *
 * @author Asus
 */
public class Area extends Shape{

    @Override
    public void RectangleArea(double length, double breadth) {
        area=length*breadth;
    }

    @Override
    public void SuareArea(double side) {
        area=side*side;
    }

    @Override
    public void CircleArea(double radius) {
        area=Math.PI*radius*radius;
    }
}
