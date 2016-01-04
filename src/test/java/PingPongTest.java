import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPong_forANumber_listUpToThatNumber() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2")), pingPong.pingPong(2));
  }
}
