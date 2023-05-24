import java.util.HashSet;

public class HashSetProgram {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW"); // can't be added cuz every HashSet's item is unique itself
    cars.add("Mazda");
    System.out.println(cars);
  }
}
