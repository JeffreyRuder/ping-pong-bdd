import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPong_forANumber_listUpToThatNumber() {
    PingPong pingPong = new PingPong();
    ArrayList<String> correctResults = new ArrayList<String>();
    correctResults.add("1");
    correctResults.add("2");
    assertEquals(correctResults, pingPong.pingPong(2));
  }
}
