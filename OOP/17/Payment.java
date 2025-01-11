
package paysystem;


public class Payment {
   
    public void makepayment(double amount){
        System.out.println("cash payment:");   
        System.out.println("Amount: "+ amount);
        System.out.println();
    }
    
    public void makepayment(double amount, String chequeNumber ){
        System.out.println("Cheque payment:");
        System.out.println("Amount: " + amount);
        System.out.println("Cheque Number: "+chequeNumber);
        System.out.println();
    }
    
    
    public void makepayment(double amount, String cardHodeername, String cardType){
        System.out.println("Card payment ");
        System.out.println("Amount: "+ amount);
        System.out.println("Name: "+cardHodeername);
        System.out.println("Card Type: "+cardType);
        
    }
}
