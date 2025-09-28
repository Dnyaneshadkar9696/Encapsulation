/**
 * Main class to demonstrate encapsulation in Java.
 * Shows how private variables cannot be accessed directly and must use getters/setters.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===");
        System.out.println("Creating animals and demonstrating encapsulation...\n");
        
        // Create an animal using the parameterized constructor
        Animal dog = new Animal("Buddy", 5, "Dog", 25.5);
        System.out.println("Animal created using constructor:");
        dog.displayInfo();
        
        // Create an animal using default constructor and setters
        Animal cat = new Animal();
        System.out.println("Animal created using default constructor:");
        cat.displayInfo();
        
        // Use setters to modify the cat's properties
        System.out.println("Setting cat properties using setter methods:");
        cat.setName("Whiskers");
        cat.setAge(3);
        cat.setSpecies("Cat");
        cat.setWeight(4.2);
        cat.displayInfo();
        
        // Demonstrate getter methods
        System.out.println("Accessing properties using getter methods:");
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's age: " + dog.getAge());
        System.out.println("Dog's species: " + dog.getSpecies());
        System.out.println("Dog's weight: " + dog.getWeight() + " kg\n");
        
        // Demonstrate validation in setters
        System.out.println("Testing validation in setter methods:");
        cat.setName(""); // Invalid name
        cat.setAge(-2);  // Invalid age
        cat.setWeight(-5.0); // Invalid weight
        
        System.out.println("Cat's properties after invalid inputs (should remain unchanged):");
        cat.displayInfo();
        
        // Show that private variables cannot be accessed directly
        System.out.println("=== Encapsulation Benefits ===");
        System.out.println("1. Private variables cannot be accessed directly:");
        System.out.println("   - dog.name would cause a compilation error");
        System.out.println("   - dog.age would cause a compilation error");
        System.out.println("   - dog.species would cause a compilation error");
        System.out.println("   - dog.weight would cause a compilation error");
        System.out.println();
        System.out.println("2. Access is controlled through getter and setter methods:");
        System.out.println("   - Use dog.getName() to read the name");
        System.out.println("   - Use dog.setName(\"NewName\") to modify the name");
        System.out.println();
        System.out.println("3. Setters can include validation logic to ensure data integrity");
        System.out.println("4. This provides data security and controlled access to class members");
    }
}