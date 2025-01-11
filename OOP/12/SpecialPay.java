/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author Asus
 */
public class SpecialPay extends PaySystem {
    
    public SpecialPay(double hour, double rate) {
        super(hour, rate);
    }
    @Override
     public double TotalPay(){
        return super.TotalPay()*0.3 + super.TotalPay();
    }
     
    @Override
    public void display(){
        System.out.println("Special pay: " + TotalPay() );
    }
}
