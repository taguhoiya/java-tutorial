import java.util.ArrayList;

public class ArrayListProgram {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
