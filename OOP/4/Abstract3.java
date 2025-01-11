
package abstract3;

import java.util.Scanner;


public class Abstract3 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in) ;
     
     Shape[] shapes= new Shape[3];
     shapes[0]=new Area();//rec
     shapes[1]=new Area();//square
     shapes[2]=new Area();//circle
     
     //display optios to the user
     
        System.out.println("Press (1) for calculating Rectangle Area");
        System.out.println("Press (2) for calculating Square Area");
        System.out.println("Press (3) for calculating Circle Area");
     
     int choice =sc.nextInt();
     switch(choice){
         case 1:
             System.out.println("Enter length are breadth of the rectangle:");
             double length=sc.nextDouble();
             double breadth=sc.nextDouble();
             shapes[0].RectangleArea(length, breadth);
             System.out.println("Rectangle Area: "+ shapes[0].getArea());
             break;
         case 2:
             System.out.println("Enter the side of the square:");
             double side = sc.nextDouble();
             shapes[1].SuareArea(side);
             System.out.println("Square Area: "+shapes[1].getArea());
             break;
         case 3:
             System.out.println("Enter the radius of the circle: ");
             double radius=sc.nextDouble();
             shapes[2].CircleArea(radius);
             System.out.println("Circle Area: "+ shapes[2].getArea());
             break;
         default:
             System.out.println("Invalid choice1");
     }
    }
    
}
