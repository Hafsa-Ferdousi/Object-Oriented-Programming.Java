
package vehiclestransport;

public class Car extends TransportVehiclle{

    public Car(String vehicleType) {
        super(vehicleType);
    }

    @Override
   void displayInfo() {
        System.out.println("This ia a "+vehicleType +" used for passenger transport.");
    }
}
