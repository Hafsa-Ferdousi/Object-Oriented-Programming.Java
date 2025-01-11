/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;

/**
 *
 * @author Asus
 */
public class SugerPurchase extends PurchaseSystem  {
    double sugerWeight;
    
    public SugerPurchase(String Productcode, int unit, double price, int quantity ,double sugerWeight) {
        super(Productcode, unit, price, quantity);
        this.sugerWeight=sugerWeight;
    }
    
    
    @Override
     public double TotalPrice(){
        return unit*quantity*price*sugerWeight;
    }
     
    @Override
      public void display(){
        System.out.println("Total price of "+ Productcode +" "+ TotalPrice() );
    }
     
}
