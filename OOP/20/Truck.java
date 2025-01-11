
package vehiclestransport;


public class Truck extends TransportVehiclle {

    public Truck(String vehicleType) {
        super(vehicleType);
    }

    @Override
   void displayInfo() {
        System.out.println("This ia a "+vehicleType +" used for passenger transport.");
    }
    
}
