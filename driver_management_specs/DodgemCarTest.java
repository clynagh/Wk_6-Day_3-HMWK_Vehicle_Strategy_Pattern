import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar car;
  QuadBike bike;


  @Before
  public void before(){
    car = new DodgemCar(10);
    bike = new QuadBike(10);
  }

  @Test
  public void driveDistanceReturnsTime(){
    assertEquals(1, bike.driveTime(10));
    assertEquals(1, car.driveTime(10));
  }
}