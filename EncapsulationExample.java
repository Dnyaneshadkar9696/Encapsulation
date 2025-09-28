class Animal {
    // Private variables - cannot be accessed directly from outside the class
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Enter a positive number for age");
        }
    }

    // Additional method to display animal info
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age + " years");
        System.out.println("------------------------");
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        System.out.println("=== Java Encapsulation Example ===\n");
        
        // Creating an Animal object
        Animal animal1 = new Animal();
        
        // Setting values using setter methods (encapsulation)
        animal1.setName("Cow");
        animal1.setAge(5);
        
        // Getting values using getter methods
        System.out.println("Using Getter Methods:");
        System.out.println("The name of the animal is: " + animal1.getName());
        System.out.println("The age of the animal is: " + animal1.getAge());
        System.out.println();
        
        // Using display method
        System.out.println("Using Display Method:");
        animal1.displayInfo();
        
        // Demonstrating validation in setter
        System.out.println("Validation Example:");
        Animal animal2 = new Animal();
        animal2.setName("Dog");
        animal2.setAge(-3); // This will trigger validation
        animal2.setAge(7);  // This will work
        animal2.displayInfo();
        
        // Note: Direct access to private variables is not allowed
        // animal1.name = "Direct Access"; // This would cause compilation error
        // animal1.age = 10; // This would cause compilation error
    }
}