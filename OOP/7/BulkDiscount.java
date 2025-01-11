/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicount;

/**
 *
 * @author Asus
 */
public class BulkDiscount extends DiscountPolicy {
    double minimum;
    double discountRate;
    
    public  BulkDiscount(double minimum,double discountRate){
        this.minimum=minimum;
        this.discountRate=discountRate;
    }

    @Override
    double computeDiscount(double count, double itemCost) {
      if(count>minimum)
        
        return count*discountRate* itemCost;
      
      else 
          return 0;
    
}
}
