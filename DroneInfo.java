package dataType;

public class DroneInfo {
  private Location currentLocation;
  private Location destination;

public Location getCurrentLocation() {
	return currentLocation;
}
public void setCurrentLocation(Location currentLocation) {
	this.currentLocation = currentLocation;
}
public Location getDestination(){
	return destination;
}
public void setDestination(Location destination){
	this.destination = destination;
}
}
