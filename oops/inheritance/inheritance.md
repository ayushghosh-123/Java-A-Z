
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

## **Types of Inheritance in Java**

1. **Single Inheritance** – One child class inherits from one parent class.
2. **Multilevel Inheritance** – A child inherits from a parent, which in turn inherits from another parent.
3. **Hierarchical Inheritance** – Multiple child classes inherit from the same parent.
   ❌ **Multiple inheritance (with classes)** is not supported in Java (to avoid ambiguity), but it can be achieved using **interfaces**.

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

## **Advantages of Inheritance**

* **Code reusability** – common code is written once in the parent class.
* **Method overriding** – child class can redefine parent methods.
* **Extensibility** – easy to add new features.
* **Improves readability** through class hierarchy.



