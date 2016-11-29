package dataType;

public class Destination {
  private LatLng latitude;
  private LatLng longitude;
  private String destinationName;
  
  private Destination(String name, LatLng lat, LatLng lon){
    destinationName = this.name;
    latitude = this.lat;
    longitude = this.lon;
  }
  
}
