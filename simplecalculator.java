import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Welcome to the Simple Calculator!");

        while (continueCalculating) {
            try {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                boolean validOperation = true;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        validOperation = false;
                        break;
                }

                if (validOperation) {
                    System.out.println("The result is: " + result);
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
                scanner.next();
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            continueCalculating = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using the Simple Calculator. Goodbye!");
        scanner.close();
    }
}
