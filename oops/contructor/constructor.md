# constructor
A constructor in Java is a special method used to initialize objects. It's automatically called when an object of a class is created using the `new` keyword. Constructors have the same name as their class and don't have a return type, not even `void`.


## 👍 Key Characteristics of Constructors

  * **Same Name as the Class**: The constructor's name must exactly match the class name.
  * **No Return Type**: Unlike regular methods, constructors do not have a return type, including `void`.
  * **Automatic Invocation**: A constructor is called automatically when an object is instantiated.
  * **Purpose**: Its primary purpose is to initialize the instance variables (member variables) of an object. This ensures that the object is in a valid state from the moment it is created.



## 🌟 Types of Constructors

### Default Constructor

If you don't define any constructor in your class, the Java compiler provides a **default constructor**. This constructor has no arguments and initializes instance variables with their default values (e.g., `0` for numeric types, `null` for objects, `false` for booleans).

```java
class Car {
    // The compiler provides a default constructor here:
    // public Car() {
    //     super(); // This is implicitly added
    // }
}

Car myCar = new Car(); // The default constructor is called
```

### No-argument Constructor (User-Defined)

A no-argument constructor is a constructor you explicitly define that takes no parameters. It's often used to provide a default state for the object, but with your own custom initialization logic.

```java
class Dog {
    String breed;
    int age;

    // No-argument constructor
    public Dog() {
        this.breed = "Unknown";
        this.age = 0;
    }
}

Dog myDog = new Dog(); // This calls the no-argument constructor
```

### Parameterized Constructor

A parameterized constructor takes one or more arguments. This allows you to initialize the instance variables of an object with specific, user-provided values at the time of its creation.

```java
class Student {
    String name;
    int studentId;

    // Parameterized constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}

Student newStudent = new Student("Alice", 12345); // This calls the parameterized constructor
```

-----

## Constructor Overloading

Just like methods, you can have multiple constructors in a single class, as long as they have different parameter lists (i.e., different numbers of parameters or different data types). This is known as **constructor overloading**.

```java
class Box {
    double width, height, depth;

    // Constructor with three parameters
    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Constructor with one parameter (cube)
    public Box(double side) {
        this.width = this.height = this.depth = side;
    }

    // No-argument constructor
    public Box() {
        this.width = this.height = this.depth = 1.0;
    }
}
```

-----

## The `this` Keyword

Within a constructor, the **`this`** keyword refers to the current object. It's commonly used to distinguish between instance variables and local variables (the parameters) that have the same name. For example, in the `Student` class above, `this.name = name;` assigns the value of the `name` parameter to the `name` instance variable of the object being created.

You can also use `this()` to call another constructor from within the same class. This is useful for avoiding code duplication when you have multiple constructors.

```java
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Calls the two-parameter constructor with default values
    public Point() {
        this(0, 0); 
    }
}
```

## New keyword - 

The `new` keyword in Java is an operator used to **create an object** from a class. It's an essential part of object-oriented programming in Java, as it allocates memory for a new object and returns a reference to that object.

### 🛠️ How it Works
---

The `new` keyword performs three main actions in a single expression:

1.  `Memory Allocation`: It allocates the required amount of memory on the heap for the new object. This memory space will store the object's instance variables.

2.  `Constructor Call` : After allocating memory, the `new` keyword calls the class's constructor. The constructor's job is to initialize the object's `instance variables` with their default values or with the values provided in the constructor's arguments.

3.  `Reference Return`: The `new` operator returns the memory address (a reference) of the newly created object. This reference can then be assigned to a variable of the class type.

### Example

Let's use a simple `Person` class to illustrate this:

```java
class Person {
    String name;
    int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("A new Person object has been created.");
    }

    public void sayHello() {
        System.out.println("Hello, my name is  Ayush Ghosh");
    }
}

public class Main {
    public static void main(String[] args) {
        Person Ayush = new Person("Ayush Ghosh", 21);
        Ayush.sayHello();
    }
}
```

**Output:**

```
A new Person object has been created.
Hello, my name is Ayush Ghosh .
```
