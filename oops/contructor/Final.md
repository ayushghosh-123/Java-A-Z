# Final Keyword

The `final` keyword in Java is a non-access modifier that you can use with **variables, methods, and classes**. Its main purpose is to prevent modification or inheritance, ensuring immutability and finality.

-----

### 1\. `final` Variable

When a variable is declared as `final`, its value can be assigned **only once**. After that, it cannot be changed. This is commonly used for defining constants.

  * **Instance Variable**: A `final` instance variable must be initialized either at the time of declaration or within a constructor.
  * **Static Variable**: A `final` static variable must be initialized at the time of declaration or within a static block.
  * **Local Variable**: A `final` local variable must be initialized before it is used for the first time.

**Example:**

```java
class MyClass {
    // Final static variable (a constant)
    public static final double PI = 3.14159;

    // Final instance variable
    final int myNumber;

    // Constructor to initialize the final variable
    public MyClass(int number) {
        this.myNumber = number; // Initialized here
    }

    public void display() {
        // You cannot change myNumber here:
        // this.myNumber = 10; // This would cause a compilation error
    }
}
```

### 2\. `final` Method

When a method is declared as `final`, it **cannot be overridden** by a subclass. This is useful for preventing a subclass from changing the behavior of a method that is critical to the class's functionality.

**Example:**

```java
class Animal {
    // A final method that cannot be overridden
    public final void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // This will cause a compilation error because makeSound() is final
    // @Override
    // public void makeSound() {
    //     System.out.println("The dog barks.");
    // }
}
```

### 3\. `final` Class

When a class is declared as `final`, it **cannot be inherited** by any other class. This is used to prevent the creation of subclasses and ensures that the class's behavior remains exactly as it was designed.

A prime example is the `String` class in Java, which is `final`. This ensures that its behavior, particularly its immutability, cannot be altered by a subclass, which is crucial for security and performance.

**Example:**

```java
final class Vehicle {
    // ... class members
}

// This will cause a compilation error because Vehicle is final
// class Car extends Vehicle {
//     // ...
// }
```

-----
