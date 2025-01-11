/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abs1;

/**
 *
 * @author Asus
 */
public class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;
    public  BulkDiscount(int mimimum,double discountRate){
      this.discountRate=discountRate;
      this.minimum=minimum;
      
        System.out.println("");
    }

    @Override
    double compleDiscount(int count, int itemCost) {
   if(count>minimum)
       return itemCost*discountRate/100;
   else 
       return 0;
    }
    
   
    
}
