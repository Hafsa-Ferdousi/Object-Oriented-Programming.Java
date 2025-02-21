
package inheritance3;

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
