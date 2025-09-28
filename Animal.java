/**
 * Animal class demonstrating encapsulation in Java.
 * Private variables can only be accessed through public getter and setter methods.
 */
public class Animal {
    // Private variables - cannot be accessed directly from outside the class
    private String name;
    private int age;
    private String species;
    private double weight;
    
    // Constructor
    public Animal(String name, int age, String species, double weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
    }
    
    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.species = "Unknown";
        this.weight = 0.0;
    }
    
    // Getter methods - provide read access to private variables
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public double getWeight() {
        return weight;
    }
    
    // Setter methods - provide controlled write access to private variables
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name provided. Name cannot be null or empty.");
        }
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age provided. Age cannot be negative.");
        }
    }
    
    public void setSpecies(String species) {
        if (species != null && !species.trim().isEmpty()) {
            this.species = species;
        } else {
            System.out.println("Invalid species provided. Species cannot be null or empty.");
        }
    }
    
    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight provided. Weight cannot be negative.");
        }
    }
    
    // Method to display animal information
    public void displayInfo() {
        System.out.println("Animal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Species: " + species);
        System.out.println("Weight: " + weight + " kg");
        System.out.println();
    }
}