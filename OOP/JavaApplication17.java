
package javaapplication17;


public class JavaApplication17 {

  
    public static void main(String[] args) {
     FullTimeEmployee a = new FullTimeEmployee("mina","w1", 200.00);
     PartTimeEmployee b =new PartTimeEmployee("minaer","p2",14,15);
     
        System.out.println("Full-time Employee: ");
        a.displayInfo();
        System.out.println("Salary: "+a.calculateSalary());
        System.out.println("Bonus: "+a.calculateBonus());
        
        System.out.println("Part-Time Employee:");
        b.displayInfo();
        System.out.println("Salary: "+b.calculateSalary());
        System.out.println("Bonus :"+b.calculateBonus());
    }
    
}
