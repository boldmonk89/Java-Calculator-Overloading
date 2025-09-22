# Java Calculator Application

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/Java-17-blue)](https://www.java.com/)

---

## Overview

The **Java Calculator Application** is a **console-based program** written in **Java**, designed to demonstrate key **object-oriented programming (OOP) concepts**, including:

- Method Overloading  
- Encapsulation  
- Modular Programming  

This application allows users to perform **basic arithmetic operations** (addition, subtraction, multiplication, division) with both **integer and floating-point numbers**.  

It is **user-friendly**, **error-tolerant**, and **educational** for beginners learning Java and OOP.

---

## Features

- **Addition**
  - Add **two numbers** (integer or double) or **three integers**  
  - Demonstrates **method overloading**
- **Subtraction**
  - Subtract two integers
- **Multiplication**
  - Multiply two numbers (integer or double)
- **Division**
  - Divide two integers  
  - Handles **division by zero** gracefully
- **Menu-driven Interface**
  - Easy navigation for multiple calculations
- **Error Handling**
  - Validates user input and prevents runtime errors

---

## Technologies Used

- Java  
- OOP Concepts: Classes, objects, method overloading, encapsulation  
- Scanner Class for user input  
- Control statements: `switch-case` and `do-while` loops  

---

## Code Structure

CalculatorApp.java
├─ Calculator          # Performs arithmetic operations
│  ├─ add()            # Overloaded: 2 ints, 2 doubles, 3 ints
│  ├─ subtract()       # Subtracts 2 integers
│  ├─ multiply()       # Multiplies 2 doubles
│  └─ divide()         # Divides 2 integers with zero-check
│
├─ UserInterface       # Handles user interaction
│  ├─ performAddition()
│  ├─ performSubtraction()
│  ├─ performMultiplication()
│  ├─ performDivision()
│  └─ mainMenu()       # Menu navigation
│
└─ CalculatorApp       # Main class to run the program



## SAMPLE CONSOLE OUTPUT ##

--- Calculator Application ---
1. Add Numbers
2. Subtract Numbers
3. Multiply Numbers
4. Divide Numbers
5. Exit
Enter your choice: 1
Do you want to add 2 or 3 numbers? 2
Enter first number: 5
Enter second number: 3
Result: 8

Enter your choice: 4
Enter numerator: 10
Enter denominator: 0
Error: Cannot divide by zero.
Result: 0

