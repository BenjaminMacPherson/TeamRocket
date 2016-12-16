package dataType;

public class ProcessPollInfo {
  private PollInfo pollInfo;
  
  public void resetPollInfo(){
		    for(int i = 0; i<pollInfo.destinationArray.length; i++){
		      pollInfo.destinationArray[i].resetCount();
		    }
  }
  
  // the int i is going to be done automatically when they push the button to vote for a destination so we don't need to worry about
  // knowing what position the destination is in the array and actually needing to know some int i.
  private void updatePollInfo(int i){
    pollInfo.destinationArray[i].increaseVoteCount();
  }
  
  public String toString(){
    return pollInfo.toString();
  }
}
