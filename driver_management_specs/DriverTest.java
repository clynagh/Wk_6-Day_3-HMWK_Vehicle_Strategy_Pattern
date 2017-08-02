import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  QuadBike bike;
  DodgemCar car;

  @Before
  public void before(){
    driver = new Driver("Pat", bike);
    bike = new QuadBike(10, 50);
    car = new DodgemCar(10, 2);
  }

  @Test
  public void getDriverName(){
    assertEquals("Pat", driver.driverName());
  }
  @Test
  public void canSetDriveQuad(){
    QuadBike bike = new QuadBike(10, 50);
    driver.setDrive(bike);
    assertEquals("Vrooom, off we go!!", bike.drive());
  }

  @Test
  public void canSetDriveDodgem(){
    DodgemCar car = new DodgemCar(10, 2);
    driver.setDrive(car);
    assertEquals("Forward, BUMP, backwards, BUMP!!", car.drive());
  }
}