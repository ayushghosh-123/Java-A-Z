# 🌟 Encapsulation

Encapsulation in Java is one of the core concepts of **Object-Oriented Programming (OOP)**.

It means **wrapping (or bundling) the data (variables) and the methods (functions) that operate on that data into a single unit (class)**, while restricting direct access to some of the object’s components.

👉 In simple words:
Encapsulation is about **hiding the internal details** of how an object works and only exposing what is necessary through methods (getters/setters).



## 👍  Key Points:

1. **Data Hiding** – The variables of a class are usually declared `private` so they cannot be accessed directly from outside the class.
2. **Controlled Access** – Public methods (`getters` and `setters`) are provided to read or modify the private variables safely.
3. **Security** – Prevents unauthorized access to important data.
4. **Flexibility** – You can change the internal implementation without affecting external code.



# ✈️ Example:

```java
class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // Using setters to set values
        s.setName("Ayush");
        s.setAge(21);

        // Using getters to get values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```


###   Output:

```
Name: Ayush
Age: 21
```

# ❓ write a java example with private variable and public method 

```java
class Person {
   
    private String name;

    // public method to set name
    public void setName(String n) {
        name = n;
    }

    // public method to display name
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // accessing private variable through public methods
        p.setName("Ayush");
        p.displayName();
    }
}
```

### output 

```bash
    Name: Ayush
```
