// Create a Main class
public class MethodsWithObject {

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        MethodsWithObject myCar = new MethodsWithObject();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}

// The car is going as fast as it can!
// Max speed is: 200