# Exception Handling
Exception handling in Java is a powerful mechanism used to handle runtime errors so that the normal flow of the program can be maintained.

---

# ✅ **What is an Exception?**

An **exception** is an event that disrupts the normal flow of the program.
Example: dividing by zero, invalid array index, file not found, etc.

---

# ✅ **Types of Exceptions**

### **1. Checked Exceptions**

→ Checked at compile time.
Examples:

* `IOException`
* `SQLException`

### **2. Unchecked Exceptions**

→ Occur at runtime.
Examples:

* `ArithmeticException`
* `NullPointerException`
* `ArrayIndexOutOfBoundsException`

### **3. Errors**

→ Serious issues, not handled normally.
Examples:

* `OutOfMemoryError`
* `StackOverflowError`

---

# ✅ **Exception Handling Keywords**

### **1. try**

Contains code that may produce an exception.

### **2. catch**

Used to handle the exception.

### **3. finally**

Always runs (whether exception occurs or not).

### **4. throw**

Used to manually throw an exception.

### **5. throws**

Used in method declaration to delegate responsibility.

---

# ✅ **Basic Example**

```java
public class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Program executed.");
        }
    }
}
```

---

# ✅ **Multiple catch blocks**

```java
try {
    int arr[] = {1, 2, 3};
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error!");
} catch (Exception e) {
    System.out.println("Some other error occurred!");
}
```

---

# ✅ **throw keyword example**

```java
public class Test {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible!");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
```

---

# ✅ **throws keyword example**

```java
import java.io.*;

class Main {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
```

---

# ⭐ If you want, I can also provide:

✔ Simple notes PDF
✔ MCQs
✔ Programs based on exception handling
✔ Assignment questions

Just tell me!
