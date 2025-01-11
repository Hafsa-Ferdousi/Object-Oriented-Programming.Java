/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abs1;

/**
 *
 * @author Asus
 */
public class OtherDiscount extends DiscountPolicy{

    @Override
    double compleDiscount(int count, int itemCost) {
    if(count>8)
      return 0.3*itemCost;
    else
        return 0;
    }
}
