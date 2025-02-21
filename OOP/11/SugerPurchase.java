
package inheritance3;

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
