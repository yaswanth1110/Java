class Person {
    String name;        // Name of the person
    static String city; // Static variable: shared by all instances
    
    // Constructor to set the person's name
    Person(String name) {
        this.name = name;
    }
    
    // Display person's information
    void displayInfo() {
        System.out.println(name + " lives in " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        // Initially assign the static city variable to 'Delhi'
        Person.city = "Delhi";
        
        // Create instances for Ram, Bheem, and Laddu
        Person ram = new Person("Ram");
        Person bheem = new Person("Bheem");
        Person laddu = new Person("Laddu");
        
        // Display info before changing the city
        ram.displayInfo();    // Output: Ram lives in Delhi
        bheem.displayInfo();  // Output: Bheem lives in Delhi
        laddu.displayInfo();  // Output: Laddu lives in Delhi
        
        // Now change the static city variable to 'Mumbai'
        Person.city = "Mumbai";
        
        // Display info after changing the city
        ram.displayInfo();    // Output: Ram lives in Mumbai
        bheem.displayInfo();  // Output: Bheem lives in Mumbai
        laddu.displayInfo();  // Output: Laddu lives in Mumbai
    }
}