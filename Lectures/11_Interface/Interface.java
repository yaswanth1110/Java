// Define an interface
interface Animal {
    // Abstract method (no implementation)
    void sound();

    // Default method (optional to override in implementing class)
    default void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Implement the interface in a class
class Dog implements Animal {
    // Provide implementation for the abstract method
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    // Provide implementation for the abstract method
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the implementing classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling the sound() method (defined by the interface)
        dog.sound();  // Output: Dog barks
        cat.sound();  // Output: Cat meows

        // Calling the default method (optional to override)
        dog.sleep();  // Output: This animal is sleeping
        cat.sleep();  // Output: This animal is sleeping

        // Calling static method of the interface (since Java 8)
        Animal.staticMethod();  // Output: This is a static method
    }
}