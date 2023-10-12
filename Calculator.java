import java.lang.Math;
public class Calculator {
    private double memory;
    private double memoryValue;

    public Calculator() {
        memory = 0;
        memoryValue = 0;
    }


    public void memoryPlus(double value) {
        memoryValue += value;
        System.out.println("Memory Plus: " + value);
    }

    public void memoryMinus(double value) {
        memoryValue -= value;
        System.out.println("Memory Minus: " + value);
    }

    public void memoryStore() {
        memory = memoryValue;
        System.out.println("Memory Stored: " + memory);
    }

    public double memoryRecall() {
        return memory;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double dividend, double divisor) {
        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // NOT-A-NUMBER [NaN]
        }
    }

    public double squareRoot(double value) {
        if (value >= 0) {
            return Math.sqrt(value);
        } else {
            System.out.println("Cannot calculate square root of a negative number.");
            return Double.NaN; // NOT-A-NUMBER [NaN]
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double addPercentage(double number, double percentage) {
        double decimalPercentage = percentage / 100;
        return number + (number * decimalPercentage);
    }
}
