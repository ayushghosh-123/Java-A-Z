
# 🌟 **Inheritance in Java**

**Definition:**
Inheritance is an **Object-Oriented Programming (OOP)** concept where one class (child/subclass) can **acquire the properties and methods** of another class (parent/superclass).

👉 It promotes **code reusability** and supports the concept of **hierarchy**.


## **Syntax**

```java
class Parent {
    // properties and methods
}

class Child extends Parent {
    // additional properties and methods
}
```
---

## :alarm_clock: **Types of Inheritance in Java**

1. **Single Inheritance**

   * One class inherits from another single class.
   * Example: `class Dog extends Animal`.

2. **Multilevel Inheritance**

   * A chain of inheritance where a class is derived from another class, which itself is derived from another class.
   * Example: `class Puppy extends Dog extends Animal`.

3. **Hierarchical Inheritance**

   * Multiple classes inherit from the same parent class.
   * Example: `class Dog extends Animal`, `class Cat extends Animal`.

4. **Multiple Inheritance (Through Interfaces only)**

   * Java does not support multiple inheritance with classes (to avoid ambiguity called *diamond problem*).
   * But it supports it using **interfaces**.
   * Example: `class SmartPhone implements Camera, MusicPlayer`.

---

## :alien: **Diagram (for clarity in exams)**

```
          Animal
         /  |   \
     Dog   Cat  Cow    <-- Hierarchical Inheritance
          ↑
        Mammal         <-- Multilevel Inheritance
```
---

## **Example: Single Inheritance**

```java
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // child class method
    }
}
```

---

## **Output**

```
Animals can eat
Dog can bark
```

---

## ☕ **Advantages of Inheritance**

* **Code reusability** – common code is written once in the parent class.
* **Method overriding** – child class can redefine parent methods.
* **Extensibility** – easy to add new features.
* **Improves readability** through class hierarchy.


## 🍵  **Types** -

In **Java**, inheritance means one class (child class or subclass) can acquire the properties and behaviors (fields and methods) of another class (parent class or superclass).

There are **five main types of inheritance**:

1. **Single Inheritance**

   * A class inherits from only one superclass.
   * Example:

     ```java
     class Animal {
         void eat() {
             System.out.println("Eating...");
         }
     }

     class Dog extends Animal {
         void bark() {
             System.out.println("Barking...");
         }
     }

     public class TestInheritance {
         public static void main(String[] args) {
             Dog d = new Dog();
             d.eat();
             d.bark();
         }
     }
     ```

2. **Multilevel Inheritance**

   * A class inherits from another class, and then another class inherits from it (a chain).
   * Example:

     ```java
     class Animal {
         void eat() {
             System.out.println("Eating...");
         }
     }

     class Dog extends Animal {
         void bark() {
             System.out.println("Barking...");
         }
     }

     class Puppy extends Dog {
         void weep() {
             System.out.println("Weeping...");
         }
     }

     public class TestInheritance {
         public static void main(String[] args) {
             Puppy p = new Puppy();
             p.eat();
             p.bark();
             p.weep();
         }
     }
     ```

3. **Hierarchical Inheritance**

   * Multiple classes inherit from a single superclass.
   * Example:

     ```java
     class Animal {
         void eat() {
             System.out.println("Eating...");
         }
     }

     class Dog extends Animal {
         void bark() {
             System.out.println("Barking...");
         }
     }

     class Cat extends Animal {
         void meow() {
             System.out.println("Meowing...");
         }
     }

     public class TestInheritance {
         public static void main(String[] args) {
             Dog d = new Dog();
             d.eat();
             d.bark();

             Cat c = new Cat();
             c.eat();
             c.meow();
         }
     }
     ```

4. **Multiple Inheritance (through Interfaces in Java)**

   * Java does not support multiple inheritance with classes (to avoid ambiguity).
   * But a class can implement multiple interfaces.
   * Example:

     ```java
     interface Printable {
         void print();
     }

     interface Showable {
         void show();
     }

     class Demo implements Printable, Showable {
         public void print() {
             System.out.println("Printing...");
         }
         public void show() {
             System.out.println("Showing...");
         }
     }

     public class TestMultipleInheritance {
         public static void main(String[] args) {
             Demo d = new Demo();
             d.print();
             d.show();
         }
     }
     ```

5. **Hybrid Inheritance**

   * A combination of two or more types of inheritance.
   * Java does not support hybrid inheritance with classes (to avoid complexity), but it can be achieved using **interfaces**.


