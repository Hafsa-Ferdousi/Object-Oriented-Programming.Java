/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Asus
 */
public abstract class TrasportVehicle implements Vehiclem {
    public String VehicleType;
public TrasportVehicle(String VehicleType){
    
    this.VehicleType= VehicleType;
    
    
}
  abstract void displayInfo();
    
}
