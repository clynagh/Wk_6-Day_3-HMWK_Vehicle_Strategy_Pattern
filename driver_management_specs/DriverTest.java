import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;

  @Before
  public void before(){
    driver = new Driver("Pat");
  }

  @Test
  public void getDriverName(){
    assertEquals("Pat", driver.driverName());
  }
}