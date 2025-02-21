
package interface2;


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
