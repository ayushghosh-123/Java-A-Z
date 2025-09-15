### ⭐ **Polymorphism**
Polymorphism is one of the important features of Object-Oriented Programming (OOP).
The word polymorphism means *“many forms”*. It allows the same operation or function name to perform different tasks depending on the context. In other words, a single method can have multiple implementations, and the decision of which implementation to use depends on whether it is compile-time or runtime.

---

### ✈️ **Types of Polymorphism**

1. **Compile-time Polymorphism (Static Polymorphism):**

   * The decision is made by the compiler at compile time.
   * It is achieved using **method overloading** (same method name but different parameter list) or **operator overloading**.
   * Example: `add(int a, int b)` and `add(double a, double b)` are two methods with the same name but different arguments.

```java
   class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));      // calls int version
        System.out.println(c.add(5.5, 2.5));  // calls double version
    }
}
```



2. **Runtime Polymorphism (Dynamic Polymorphism):**

   * The decision is made at runtime by the Java Virtual Machine (JVM).
   * It is achieved using **method overriding**, where a subclass provides its own definition of a method already defined in the parent class.
   * Example: A parent class `Animal` has a method `sound()`, but the child class `Dog` overrides it to give its own implementation.


```java 
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, Child object
        a.sound(); // calls Dog's method (runtime decision)
    }
}

```
---


