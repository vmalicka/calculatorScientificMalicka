import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean shouldQuit = false;

        while (!shouldQuit) {
            System.out.println("Menu:");
            System.out.println("1. Perform calculations");
            System.out.println("2. Memory operations");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();

                    double result = calculator.add(num1, num2);
                    System.out.println("Addition: " + result);

                    result = calculator.subtract(num1, num2);
                    System.out.println("Subtraction: " + result);

                    result = calculator.multiplication(num1, num2);
                    System.out.println("Multiplication: " + result);

                    result = calculator.divide(num1, num2);
                    System.out.println("Division: " + result);

                    result = calculator.squareRoot(num1);
                    System.out.println("Square Root of " + num1 + ": " + result);

                    result = calculator.power(num1, num2);
                    System.out.println(num1 + " raised to the power of " + num2 + ": " + result);

                    System.out.print("Enter a number to add a percentage to: ");
                    double numberToAddPercentageTo = scanner.nextDouble();
                    System.out.print("Enter the percentage to add: ");
                    double percentageToAdd = scanner.nextDouble();

                    result = calculator.addPercentage(numberToAddPercentageTo, percentageToAdd);
                    System.out.println("Result after adding " + percentageToAdd + "%: " + result);
                    break;

                case 2:
                    System.out.println("Memory: " + calculator.memoryRecall());
                    System.out.println("1. Memory Plus");
                    System.out.println("2. Memory Minus");
                    System.out.println("3. Memory Store");
                    System.out.println("4. Memory Recall");
                    System.out.println("5. Back to Main Menu");
                    System.out.print("Enter your choice: ");

                    int memoryChoice = scanner.nextInt();

                    switch (memoryChoice) {
                        case 1:
                            System.out.print("Enter value to add to memory: ");
                            double valueToAdd = scanner.nextDouble();
                            calculator.memoryPlus(valueToAdd);
                            break;
                        case 2:
                            System.out.print("Enter value to subtract from memory: ");
                            double valueToSubtract = scanner.nextDouble();
                            calculator.memoryMinus(valueToSubtract);
                            break;
                        case 3:
                            calculator.memoryStore();
                            break;
                        case 4:
                            double memoryRecall = calculator.memoryRecall();
                            System.out.println("Memory Recall: " + memoryRecall);
                            break;
                        case 5:
// Return to the main menu
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    shouldQuit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}
