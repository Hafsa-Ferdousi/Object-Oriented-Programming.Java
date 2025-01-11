
package abs1;

public class Abs1 {

    
    public static void main(String[] args) {
        BulkDiscount b=new  BulkDiscount(5,10);
        OtherDiscount o=new OtherDiscount();
         
        
        System.out.println("Bulk D="+ b.compleDiscount(3, 10));
        System.out.println();
        System.out.println("Other D = "+ o.compleDiscount(3, 10));
        System.out.println("Other D = "+ o.compleDiscount(9, 10));
    }
    
}
