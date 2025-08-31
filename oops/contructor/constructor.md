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


