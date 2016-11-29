package dataType;

public class Destination {
  private LatLng latitude;
  private LatLng longitude;
  private String destinationName;
  private int voteCount;
  
  private Destination(String name, LatLng lat, LatLng lon){
    destinationName = this.name;
    latitude = this.lat;
    longitude = this.lon;
    voteCount = 0;
  }
  
  private void resetCount(){
   voteCount = 0; 
  }
  
}
