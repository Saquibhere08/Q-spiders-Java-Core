# Java Core -- README

## Overview

This repository contains examples and explanations of **Java Core
concepts**.\
It is designed for beginners and intermediate developers who want to
understand the fundamentals of Java programming.

------------------------------------------------------------------------

## Table of Contents

1.  Introduction to Java
2.  Installation & Setup
3.  Java Basics
4.  Object-Oriented Programming (OOP)
5.  Exception Handling
6.  Collections Framework
7.  Multithreading
8.  File Handling
9.  Java 8+ Features
10. Best Practices
11. Resources

------------------------------------------------------------------------

## 1. Introduction to Java

Java is a **high-level, object-oriented, platform-independent
programming language** developed by Sun Microsystems (now owned by
Oracle).

Key Features: - Platform Independent (Write Once Run Anywhere) -
Object-Oriented - Secure - Robust - Multithreaded - High Performance
with JVM

------------------------------------------------------------------------

## 2. Installation & Setup

### Install JDK

Download JDK from: https://www.oracle.com/java/technologies/downloads/

### Verify Installation

``` bash
java -version
javac -version
```

### Compile and Run a Program

``` bash
javac HelloWorld.java
java HelloWorld
```

------------------------------------------------------------------------

## 3. Java Basics

### Example Program

``` java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Concepts: - Variables - Data Types - Operators - Control Statements -
Loops

------------------------------------------------------------------------

## 4. Object-Oriented Programming (OOP)

Java supports:

-   Encapsulation
-   Inheritance
-   Polymorphism
-   Abstraction

Example:

``` java
class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
```

------------------------------------------------------------------------

## 5. Exception Handling

Java handles runtime errors using **try-catch blocks**.

``` java
try {
    int a = 10 / 0;
} catch(Exception e) {
    System.out.println(e);
}
```

Keywords: - try - catch - finally - throw - throws

------------------------------------------------------------------------

## 6. Collections Framework

Popular collections:

-   ArrayList
-   LinkedList
-   HashMap
-   HashSet
-   TreeMap

Example:

``` java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
```

------------------------------------------------------------------------

## 7. Multithreading

Java supports concurrent execution using threads.

Example:

``` java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```

------------------------------------------------------------------------

## 8. File Handling

Java provides file operations using:

-   File
-   FileReader
-   FileWriter
-   BufferedReader

Example:

``` java
File file = new File("test.txt");
```

------------------------------------------------------------------------

## 9. Java 8+ Features

Important features introduced in Java 8:

-   Lambda Expressions
-   Streams API
-   Functional Interfaces
-   Optional Class
-   Method References

Example Lambda:

``` java
(a, b) -> a + b
```

------------------------------------------------------------------------

## 10. Best Practices

-   Follow naming conventions
-   Write modular code
-   Handle exceptions properly
-   Use meaningful variable names
-   Write comments and documentation

------------------------------------------------------------------------

## 11. Resources

Official Java Documentation: https://docs.oracle.com/javase/

Learning Platforms: - GeeksforGeeks - Baeldung - Oracle Java Docs -
JavaTPoint

------------------------------------------------------------------------

## Author

Saquib Bin Halim

## License

This project is open-source and free to use.
