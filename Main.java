import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double result = calculator.add(num1, num2);
        System.out.println("Addition: " + result);

       result = calculator.memoryPlus(num1,num2);
        System.out.println("Memory Plus: " + result);

        calculator.memoryMinus(num1,num2);
        System.out.println("Memory Minus: " + result);

        calculator.memoryStore(num1,num2);
        System.out.println("Memory Store: " + result);

        result = calculator.percent(num1,num2);
        System.out.println("Percent: " + result);

        result = calculator.subtract(num1, num2);
        System.out.println("Subtraction: " + result);

        result = calculator.multiply(num1, num2);
        System.out.println("Multiplication: " + result);

        result = calculator.divide(num1, num2);
        System.out.println("Division: " + result);

        result = calculator.squareRoot(num1);
        System.out.println("Square Root of " + num1 + ": " + result);

        result = calculator.power(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + ": " + result);

        scanner.close();
    }

}
