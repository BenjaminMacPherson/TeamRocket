package dataType;

public class ProcessDroneInfo {
  DroneInfo droneInfo;
  
  //maybe we should just change this to toString()
  private void getDroneInfo(){
    System.out.println("Drone's current location: " + droneInfo.getCurrentLocation());
    System.out.println("Drone's destination: " + droneInfo.getDestination());
  }  

  public void setDestination(Location d){
    droneInfo.setDestination(d);;
  }
}
