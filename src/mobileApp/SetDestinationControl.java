package mobileApp;

import DataType.ProcessDroneInfo;

// idk if we need to import destination because it's being sent in from the UI. I also don't know anything about coding anyways
import DataType.Destination;

public class SetDestinationControl {

  private ProcessDroneInfo PDI = new ProcessDroneInfo();
  
  private void control(Destination d){
    PDI.setDestination(d);
  }
}
