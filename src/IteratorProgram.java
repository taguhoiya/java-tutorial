// Import the ArrayList class and the Iterator class

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
      Integer i = it.next();
      if (i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);

    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
