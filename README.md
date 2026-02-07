# Java – Quick Overview (Core + OOPS)

## What is Java?
Java is a **high-level, object-oriented, platform-independent** programming language.  
It follows the principle **“Write Once, Run Anywhere” (WORA)**.

Java code is compiled into **bytecode**, which runs on the **Java Virtual Machine (JVM)**.

---

## How Java Works (Execution Flow)

1. You write code in a `.java` file
2. `javac` compiler converts it into `.class` (bytecode)
3. JVM executes the bytecode on any OS


---

## Key Components

### JDK (Java Development Kit)
- Used to develop Java programs
- Includes JRE + compiler + tools

### JRE (Java Runtime Environment)
- Provides environment to run Java programs

### JVM (Java Virtual Machine)
- Executes bytecode
- Makes Java platform-independent

---

## Basic Structure of a Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
