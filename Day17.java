// Class A with default and parameterized constructors
class A {
    // Default constructor
    A() {
        System.out.println("Hello I am A class !!!");
    }

    // Parameterized constructor
    A(int a) {
        this(); // Calls the default constructor
        System.out.println("Hell a is " + a);
    }
}

// Main class to execute the program
public class Day17 {
    public static void main(String[] args) {
        new A(34); // Creates an object of A and invokes the parameterized constructor
    }
}