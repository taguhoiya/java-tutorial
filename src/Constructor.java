// Create a Main class
public class Constructor {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    // we cant initialize the attribute below, we have to declare before constructor class
    public Constructor() {
        x = 5;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}
