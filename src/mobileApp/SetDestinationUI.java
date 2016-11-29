package mobileApp;

import DataType.Destination;

public class SetDestinationUI {
  SetDestinationControl SDC = new SetDestinationControl();
  Destination d = new Destination(); //not really sure if this is the correct way to go about it. Double check to make sure
  
  public void control(){
    SDC.control(d);
  }
  
  

}
