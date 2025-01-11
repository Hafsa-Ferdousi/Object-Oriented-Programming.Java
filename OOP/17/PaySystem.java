/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paysystem;

/**
 *
 * @author Asus
 */
public class PaySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Payment p = new Payment();
        p.makepayment(1000);
        p.makepayment(10002, "sd1275432");
        p.makepayment(100500, "Hafsa", "Visa");
    }
    
}
