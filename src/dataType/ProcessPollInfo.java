package dataType;

public class ProcessPollInfo {
  private PollInfo pollInfo;
  
  private void resetPollInfo(){
    pollInfo.resetPollRestults(); 
  }
  
  // the int i is going to be done automatically when they push the button to vote for a destination so we don't need to worry about
  // knowing what position the destination is in the array and actually needing to know some int i.
  private void updatePollInfo(int i){
    pollInfo.destinationArray[i].increaseVoteCount();
  }
  
  private String toString(){
    return (pollInfo.toString());
  }
}
