
package labshape;

import java.util.Scanner;
public class LAbShape {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        shapes[0]=new Area();
        shapes[1]= new Area();
        shapes[2]= new Area();
        
        System.out.println("Press (1) for calculating Rectangle Area");
        System.out.println("Press (2) for calculating Square Area");
        System.out.println("Press (3) for calculating Circle Area");
        
        
        int choice =sc.nextInt();
        switch(choice){
        case 1:
        System.out.println("Enter length and breadth of the ractangle: ");
        double length =sc.nextDouble();
        double breadth=sc.nextDouble();
        shapes[0].RectangleArea(breadth, length);
           
          System.out.println("Rectangle Area: " + shapes[0].getArea());
                break;
            case 2:
                System.out.println("Enter the side of the square:");
                double side = sc.nextDouble();
                shapes[1].SquareArea(side);
                System.out.println("Square Area: " + shapes[1].getArea());
                break;
            case 3:
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                shapes[2].CircleArea(radius);
                System.out.println("Circle Area: " + shapes[2].getArea());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}


  