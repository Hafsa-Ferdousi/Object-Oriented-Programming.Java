
package shapepoly;


abstract class Polygon implements Shape {
   protected int numberOfSides; 
   
   public Polygon(int numberOfSides){
       this.numberOfSides=numberOfSides;
   }
   
   @Override
   public abstract double calcuatePerimeter();
}
