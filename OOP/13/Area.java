
package labshape;


public class Area extends Shape {

    @Override
    public void RectangleArea(double breadth, double length) {
        
        area= breadth* length  ;
    }
    
    
    @Override
    public void SquareArea(double side) {
        
    area=side*side;
    }

    @Override
    public void CircleArea(double radius) {
   
        area=Math.PI*radius*radius;
    }
    
    
}
