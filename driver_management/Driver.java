package driver_management;
import behaviours.*;

public class Driver{
  String name;
  private Driveable drive;

  public Driver(String name, Driveable drive){
  this.name = name;
  this.drive = drive;
}
public String driverName(){
  return this.name;
}

public void setDrive(Driveable drive){
    this.drive = drive;
  }

}



