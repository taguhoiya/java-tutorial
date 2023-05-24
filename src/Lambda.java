import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
  String run(String str);
}

public class Lambda {
  public static void main(String[] args) {
    // lambda with Consumer interface
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> {
      System.out.println(n);
    };
    numbers.forEach(method);

    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }

  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
