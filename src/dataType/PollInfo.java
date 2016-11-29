package dataType;

public class PollInfo {
  Private Destination[] destinationArray;
  
  private void resetPollResults(){
    for(int i = 0; i<destinationArray.length(); i++){
      destinationArray[i].resetCount();
    }
  }
  
  private String toString(){
    
  }
  
}
