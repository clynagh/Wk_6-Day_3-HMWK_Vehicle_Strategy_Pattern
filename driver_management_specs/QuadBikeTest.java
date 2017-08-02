import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike bike;

  @Before
  public void before(){
    bike = new QuadBike(10);
  }

  @Test
  public void driveDistanceReturnsTimes(){
    assertEquals(1, bike.driveTime(10));
  }

  @Test
  public void showEngineCapacity(){
    assertEquals(50, bike.engineCapacity());
  }
}