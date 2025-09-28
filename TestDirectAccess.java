/**
 * This class demonstrates that direct access to private variables causes compilation errors.
 * Uncomment the lines in the main method to see the compilation errors.
 */
public class TestDirectAccess {
    public static void main(String[] args) {
        Animal animal = new Animal("Test", 1, "Test Species", 10.0);
        
        // The following lines would cause compilation errors if uncommented:
        
        // System.out.println(animal.name);     // Error: name has private access in Animal
        // System.out.println(animal.age);      // Error: age has private access in Animal
        // System.out.println(animal.species);  // Error: species has private access in Animal
        // System.out.println(animal.weight);   // Error: weight has private access in Animal
        
        // animal.name = "New Name";     // Error: name has private access in Animal
        // animal.age = 5;               // Error: age has private access in Animal
        // animal.species = "New Species"; // Error: species has private access in Animal
        // animal.weight = 15.0;         // Error: weight has private access in Animal
        
        // Instead, we must use getters and setters:
        System.out.println("Correct way to access private variables:");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Species: " + animal.getSpecies());
        System.out.println("Weight: " + animal.getWeight());
        
        // Correct way to modify private variables:
        animal.setName("Modified Name");
        animal.setAge(6);
        System.out.println("\nAfter modification:");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
    }
}