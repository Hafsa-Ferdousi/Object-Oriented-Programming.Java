
package amimaltest;


public class AmimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d=new Dog("Tom");
        Cat c= new Cat("Joly");
        d.showName();
        d.sound();
        d.sleep();
        
        System.out.println();
        
        c.showName();
        c.sound();
        c.sleep();
        
    }
    
}
