
package vehiclestransport;


 abstract class TransportVehiclle implements Vehicle{
   
     public String vehicleType;
     
     public TransportVehiclle(String vehicleType){
       this.vehicleType= vehicleType;  
     }
     
     @Override
     public void start()  {
         System.out.println(vehicleType+" is strating."); 
    }
     @Override
  public void stop(){
         System.out.println(vehicleType+ " has stopped");  
  }
  
  abstract void  displayInfo();
  
}
