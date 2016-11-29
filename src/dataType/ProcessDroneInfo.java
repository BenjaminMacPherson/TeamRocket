package dataType;

public class ProcessDroneInfo {
  DroneInfo droneInfo;
  
  //maybe we should just change this to toString()
  private void getDroneInfo(){
    System.out.println("Drone's current location: " + droneInfo.currentLocation);
    System.out.println("Drone's destination: " + droneInfo.destination);
  }  

  private void SetDestination(destination d){
    droneInfo.destination = d;
  }
}
