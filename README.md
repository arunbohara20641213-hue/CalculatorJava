# Simple Java Calculator

A simple, interactive command-line calculator built in Java that performs basic arithmetic operations: addition, subtraction, multiplication, and division.

## Features

- Menu-driven interface
- Supports four basic arithmetic operations
- Loop allows multiple calculations in one session
- User can start a new calculation or quit at any time
- Handles decimal numbers (using `double`)

## Prerequisites

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Clone or download the repository
2. Navigate to the project directory
3. Compile the program:
   ```bash
   javac Calculator.java
 
# Usage
textEnter a whether to start or quit the calculator : start
Enter the first number: 15.5
Enter the second number: 5
Select what you want to do :
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter the operation from the above number : 1
The sum is : 20.5

Enter a whether to start or quit the calculator : quit
Calculator is exited!!



### Known Limitations

•  No custom handling for division by zero (Java returns Infinity or -Infinity)
•  Basic input validation only
•  Uses Scanner with mixed nextDouble(), nextInt(), and nextLine() which can sometimes cause newline issues (common beginner pitfall)
