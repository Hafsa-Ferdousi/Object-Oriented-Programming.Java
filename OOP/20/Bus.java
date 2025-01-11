
package vehiclestransport;


public class Bus extends TransportVehiclle{

    public Bus(String vehicleType) {
        super(vehicleType);
    }

    @Override
    void displayInfo() {
        System.out.println("This ia a "+vehicleType +" used for passenger transport.");
    }
    
    
}
