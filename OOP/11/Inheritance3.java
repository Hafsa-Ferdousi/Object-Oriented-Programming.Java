/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance3;

/**
 *
 * @author Asus
 */
public class Inheritance3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PurchaseSystem p=new PurchaseSystem ("P103",3,32,3);
        SugerPurchase s=new SugerPurchase("Suger101",2,106,2,3);
        p.display();
        s.display();
    }
    
}
