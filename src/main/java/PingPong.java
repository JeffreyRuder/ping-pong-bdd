import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<String> pingPong(Integer number) {
    ArrayList<String> results = new ArrayList<String>();

    for (int i = 1; i <= number; i++) {
      if (i % 15 == 0) {
        results.add("PingPong");
      } else if (i % 3 == 0) {
        results.add("Ping");
      } else if (i % 5 == 0) {
        results.add("Pong");
      } else {
        results.add(Integer.toString(i));
      }
    }

    return results;

  }
}
