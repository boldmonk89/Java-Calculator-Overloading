import java.util.*;
// Calculator class with overloaded methods
class Calculator {

    // add methods (overloading)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // multiplication
    double multiply(double a, double b) {
        return a * b;
    }

    // division with zero check
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }
}

// UserInterface class
class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    void performAddition() {
        System.out.print("Do you want to add 2 or 3 numbers? ");
        int count = sc.nextInt();

        if (count == 2) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // int vs double check
            if (a % 1 == 0 && b % 1 == 0) {
                System.out.println("Result: " + calc.add((int) a, (int) b));
            } else {
                System.out.println("Result: " + calc.add(a, b));
            }

        } else if (count == 3) {
            System.out.print("Enter three integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b, c));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    void performMultiplication() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    void performDivision() {
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.divide(a, b));
    }

    void mainMenu() {
        int choice;
        do {
            System.out.println("\n--- Calculator Application ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: performAddition(); break;
                case 2: performSubtraction(); break;
                case 3: performMultiplication(); break;
                case 4: performDivision(); break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}

// Main class
public class CalculatorApp {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
