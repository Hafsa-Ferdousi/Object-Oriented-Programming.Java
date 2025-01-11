/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;

/**
 *
 * @author Asus
 */
public class PurchaseSystem {
    String Productcode;
    int unit;
    double price;
    int quantity;
    
    public PurchaseSystem(String Productcode,int unit,double price,int quantity){
     this.Productcode=Productcode;
     this.price=price;
     this.quantity=quantity;
     this.unit=unit;
     
    }
     
    public double TotalPrice(){
        return unit*quantity*price;
    }
    
    public void display(){
        System.out.println("Total price of "+ Productcode+ " "+ TotalPrice() );
    }
    
}
