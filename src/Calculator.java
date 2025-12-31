impoimport java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner takeInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter whether to start or quit the calculator: ");
            String guess = takeInput.nextLine().trim().toLowerCase();

            if (guess.equals("start")) {

                System.out.print("Enter the first number: ");
                double num1 = takeInput.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = takeInput.nextDouble();

                System.out.println("Select what you want to do:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.print("Enter the operation number: ");
                int choice = takeInput.nextInt();
                takeInput.nextLine();
                double result;
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("The sum is: " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("The difference is: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("The product is: " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("The division is: " + result);
                        }
                        break;

                    default:
                        System.out.println("Invalid operation.");
                }

            } else if (guess.equals("quit")) {
                System.out.println("Calculator exited!!");
                break;
            } else {
                System.out.println("Invalid input. Type 'start' or 'quit'.");
            }
        }

        takeInput.close();
    }
}
