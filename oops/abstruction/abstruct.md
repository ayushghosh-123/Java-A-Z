# Abstruction

Perfect 👍 For a **10 marks university exam answer**, you need **definition + explanation + advantages + example + output**.
Here’s a complete yet exam-friendly version 👇


# **Abstraction in Java**

**Definition:**
Abstraction in Java is the process of **hiding the internal implementation details** of an object and exposing only the **essential features**. It tells the user **what an object does**, not **how it does**.



## **How Abstraction is Achieved**

1. **Abstract Class** – A class declared with the `abstract` keyword.

   * Can have both abstract (without body) and concrete (with body) methods.
2. **Interface** – A collection of abstract methods (Java 8+ also allows default and static methods).



## **Advantages of Abstraction**

* **Hides complexity** and shows only necessary details.
* **Increases security** by hiding internal code.
* **Improves flexibility** – implementation can change without affecting users.
* **Improves code reusability** and **maintainability**.

---

## **Example: Abstract Class**

```java
abstract class Vehicle {
    abstract void start();   // abstract method
    void fuel() {            // concrete method
        System.out.println("Filling fuel...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();   // reference of abstract class
        v.start();   // calls abstract method
        v.fuel();    // calls normal method
    }
}
```

---

## **Output**

```
Car starts with a key
Filling fuel...
```

