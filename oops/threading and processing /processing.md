# 🚀 **What is a Process?**

A **process** is an executing program.
Example: When you open Chrome, your computer creates a process for Chrome.

Each process has:

* Its **own memory**
* Its **own address space**
* Its **own resources** (files, CPU time, etc.)

Processes **do NOT share memory** by default.



# 🆚 **Process vs Thread**

| Feature       | Process             | Thread             |
| ------------- | ------------------- | ------------------ |
| Memory        | **Separate** memory | **Shared** memory  |
| Speed         | Slower              | Faster             |
| Communication | Hard (IPC needed)   | Easy               |
| Example       | Running Chrome      | Tabs inside Chrome |



# 🧠 **Why Processes Are Needed**

✔ Run separate applications

✔ Provide isolation (one crash doesn't stop another)

✔ Secure and stable

---

# 🛠️ **Creating a Process in Java**

Java uses **ProcessBuilder** or **Runtime.getRuntime().exec()** to create processes.

---

# ✅ **Example 1: Start a Process (Open Notepad)**

```java
public class Main {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("notepad");
            System.out.println("Notepad Started...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

---

# ✅ **Example 2: Using ProcessBuilder**

```java
import java.io.IOException;

public class ProcessDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            Process p = pb.start();
            System.out.println("Process Started...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

# 🔍 **Example 3: Running a Command in Terminal**

```java
public class Main {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("cmd /c dir");

            System.out.println("Command Executed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

# 🧵 **Process vs Thread in Java (Mini Example)**

### **Thread Example**

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Running...");
    }
}
```

### **Process Example**

```java
Process p = Runtime.getRuntime().exec("notepad");
```

Threads run **inside** a process, not outside.

---

# 🧪 **Example: Get Process Output**

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("cmd /c dir");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(p.getInputStream())
            );

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

# 🔥 **Example: Check Exit Value of a Process**

```java
public class Main {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("notepad");
            p.waitFor();  // Wait for process to close
            
            System.out.println("Exit Code: " + p.exitValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---



