
package recshape;


public class RecShape {

    
    public static void main(String[] args) {
        Rectangle Rec = new Rectangle( 1,5);
        
        Circle circle = new Circle(3);
        
        System.out.println("Area of the Rectangle: " + Rec.getArea());
        System.out.println("Area of the Circle: " + circle.getArea());
    }
    
}
