
package inheritance1;


public class Animal extends  Organism  {
   public String eat;

    public Animal(double size, double gwowthrate, String eat) {
        super(size, gwowthrate);
        this.eat=eat;
        
        
        }
    public void display(){
            System.out.println("size: "+size);
            System.out.println("growth Rate : "+ gwowthrate);
            System.out.println("Amimal eat- " +eat);
    }
   
    
}
