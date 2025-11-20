# class

A class in Java is a blueprint or template used to create objects.
It defines data members (variables) and methods (functions) that describe the state and behavior of the objects.

👍 Key Points -
---
1. A class is declared using the class keyword.
2. It can contain: variable , function , constructor
3. Objects are created from a class using the new keyword.
4. It is didn't occupy the memory

🚀 Code -
---
```java
class Student {
    // Data members
    String name;
    int rollNo;

    // Method
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Object creation
        s1.name = "Ayush";
        s1.rollNo = 101;
        s1.display();
    }
}

```

# Object -

An object in Java is an instance of a class. It represents a real-world entity and has state (data) and behavior (methods) defined by its class.

👍 key features-
---

1. Objects are created  from the  classes using the new keyword.

2. Each object has its own copy of the class’s data members.

3. Objects can call methods to perform actions.

🚀code -
---
```java
    class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Object creation
        s1.name = "Ayush";
        s1.rollNo = 101;
        s1.display();
    }
}

```


