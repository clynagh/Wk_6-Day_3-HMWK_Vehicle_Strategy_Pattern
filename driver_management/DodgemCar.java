package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable{
  private int averageSpeed;
  int seats;

  public DodgemCar(int averageSpeed, int seats){
    this.averageSpeed = averageSpeed;
    this.seats = seats;
  }

public int driveTime(int distance) {
  return distance/this.averageSpeed;
}

public int numberOfSeats(){
  return this.seats;
}

}