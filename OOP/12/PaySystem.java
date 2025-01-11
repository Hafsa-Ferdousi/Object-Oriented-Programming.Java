/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author Asus
 */
public class PaySystem {
    double hour;
    double rate;
     
    public  PaySystem (double hour, double rate){
        this.hour=hour;
        this.rate=rate;
        
    }
      
    public double TotalPay(){
        return hour*rate;
    }
    
    public void display(){
        System.out.println("Total pay: "+ TotalPay() );
    }
    
}
