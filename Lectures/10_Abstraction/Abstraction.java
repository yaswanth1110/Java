// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();
    
    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Concrete subclass of Animal
class Dog extends Animal {
    // Provide implementation for the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    // Provide implementation for the abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of subclasses
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Call abstract method (implemented in subclasses)
        dog.sound();  // Output: Dog barks
        cat.sound();  // Output: Cat meows
        
        // Call regular method
        dog.sleep();  // Output: This animal is sleeping
        cat.sleep();  // Output: This animal is sleeping
    }
}