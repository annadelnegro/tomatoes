# **Tomato Distribution Optimization Project**

This project involves a Java-based program to optimize tomato distribution across multiple stoves, ensuring even distribution with the minimum number of moves. It includes a Python script for testing the program's logic and performance with predefined test cases.

---

## **Project Structure**

### **Java Files**
- **`Tomatoes.java`**
  - Core class that implements the logic for tomato distribution.
  - Handles calculations for the number of moves required to achieve even distribution or determines if the distribution is impossible.

- **`TomatoesDriver.java`**
  - Main driver program for running test cases.
  - Interfaces with the `Tomatoes` class to process inputs and output results.

### **Python Files**
- **`p3testscript.py`**
  - Automated test script written in Python.
  - Runs the Java program with various inputs and validates the results against expected outputs.

### **Sample Solution**
- **`samplesolutionp3.txt`**
  - Contains the expected results for predefined test cases.
  - Demonstrates correct behavior for all scenarios, including cases where even distribution is impossible.

---

## **Getting Started**

### **Prerequisites**
- Java Development Kit (JDK) 8 or later.
- Python 3.x.
- A text editor or IDE for Java development (e.g., IntelliJ IDEA, Eclipse).
- Python package manager (`pip`) for running the test script.

### **Setup**
1. Clone or download this repository.
2. Place the Java files (`Tomatoes.java` and `TomatoesDriver.java`) into a project folder in your Java IDE.
3. Ensure the Python script (`p3testscript.py`) and sample solution (`samplesolutionp3.txt`) are in the same directory.

---

## **Usage**

### **Running the Java Program**
1. Compile the Java files:
   ```bash
   javac Tomatoes.java TomatoesDriver.java
