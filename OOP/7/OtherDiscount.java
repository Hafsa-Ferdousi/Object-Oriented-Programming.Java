/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicount;

/**
 *
 * @author Asus
 */
public class OtherDiscount extends DiscountPolicy{

    @Override
    double computeDiscount(double count, double itemCost) {
      if (count>8)  
          return itemCost*.3;
      else if(count>=6 && count<8)
      return itemCost*.2;
      else if(count>=3 && count<5)
      return itemCost*.1;
      else
          return 0;
    }
    
}
