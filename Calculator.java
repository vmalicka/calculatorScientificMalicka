import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    private double memory;
    public Calculator() {
        memory = 0;
    }
    public void memoryPlus(double value) {
        memory += value;
    }
    public void memoryMinus(double value) {
        memory -= value;
    }
    public void memoryStore(double value) {
        memory = value;
    }
    public double memoryRecall() {
        return memory;
    }
    public double percent(double value, double percentage) {
        return value * (percentage / 100);
    }
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double squareRoot(double value) {
        return Math.sqrt(value);
    }
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double result = calculator.add(num1, num2);
        System.out.println("Addition: " + result);

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

