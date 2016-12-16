package dataType;

public class Location {
  private LatLng LL;
  private String locationName;
  private int voteCount;
  
  private Location(String name, LatLng LL){
    locationName = name;
    this.LL = LL;
    voteCount = 0;
  }
  
  void resetCount(){
    voteCount = 0; 
  }
  
  void increaseVoteCount(){
    voteCount++;
  }
  
}
