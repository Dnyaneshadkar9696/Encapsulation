# Encapsulation
Simple Java example demonstrating encapsulation with Animal class

## Overview
This repository demonstrates the concept of **encapsulation** in Java, one of the four fundamental principles of Object-Oriented Programming (OOP). Encapsulation ensures that the internal state of an object is hidden from the outside world and can only be accessed through controlled methods.

## Key Concepts Demonstrated

### 1. Private Variables
- Private instance variables (`name`, `age`, `species`, `weight`) cannot be accessed directly from outside the class
- This protects the internal state of the object from unauthorized access and modification

### 2. Public Getter Methods
- Provide read access to private variables
- Follow naming convention: `get` + `VariableName` (e.g., `getName()`, `getAge()`)

### 3. Public Setter Methods
- Provide controlled write access to private variables
- Include validation logic to ensure data integrity
- Follow naming convention: `set` + `VariableName` (e.g., `setName()`, `setAge()`)

## Files in this Repository

- **Animal.java**: Main class demonstrating encapsulation with private variables and getter/setter methods
- **Main.java**: Demo class showing how to use the Animal class and the benefits of encapsulation
- **TestDirectAccess.java**: Example showing that direct access to private variables causes compilation errors

## How to Run

1. Compile all Java files:
   ```bash
   javac *.java
   ```

2. Run the main demonstration:
   ```bash
   java Main
   ```

3. Run the direct access test:
   ```bash
   java TestDirectAccess
   ```

## Benefits of Encapsulation

1. **Data Security**: Private variables cannot be accessed directly from outside the class
2. **Data Validation**: Setter methods can include validation logic to ensure data integrity
3. **Controlled Access**: Access to class members is controlled through public methods
4. **Maintainability**: Internal implementation can be changed without affecting external code
5. **Code Organization**: Clear separation between internal state and external interface
