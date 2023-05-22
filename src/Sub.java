public class Sub {

  public static void main(String[] args) {
    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);

    final int myNumVer2 = 15;
    myNumVer2 = 20;  // will generate an error: cannot assign a value to a final variable
  }
}
