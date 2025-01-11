
package vehiclestransport;


public class VehiclesTransport {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Bus b=new Bus("Bus");
        Truck t=new Truck("Truck");
        Car c=new Car("car");
        b.start();
        b.displayInfo();
        b.stop();
        
        System.out.println();
        
        t.start();
        t.displayInfo();
        t.stop();
        
        System.out.println();
        
        c.start();
        c.displayInfo();
        c.stop();
        
    }
    
}
