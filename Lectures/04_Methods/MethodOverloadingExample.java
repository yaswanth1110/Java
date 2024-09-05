package lectures;

public class MethodOverloadingExample {

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Calling overloaded methods
        example.display();                        // No parameter
        example.display("Hello, World!");         // One String parameter
        example.display("Java", 101);             // Two parameters: String, int
        example.display(42);                      // One int parameter
        example.display(3.14);                    // One double parameter
        example.display(101, "Overloading");      // Two parameters: int, String (different order)
    }

    // Overloading based on different number of parameters
    public void display() {
        System.out.println("Display method with no parameters");
    }

    public void display(String message) {
        System.out.println("Display method with one parameter: " + message);
    }

    public void display(String message, int number) {
        System.out.println("Display method with two parameters: " + message + ", " + number);
    }

    // Overloading based on different types of parameters
    public void display(int number) {
        System.out.println("Display method with an integer parameter: " + number);
    }

    public void display(double value) {
        System.out.println("Display method with a double parameter: " + value);
    }

    // Overloading based on different order of parameters
    public void display(int number, String message) {
        System.out.println("Display method with different order: " + number + ", " + message);
    }


}
