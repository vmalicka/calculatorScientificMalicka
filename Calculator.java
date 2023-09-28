public class Calculator {
    private double memory;
    public Calculator() {
        memory = 0;
    }
    public double memoryPlus(double value, double num2) {
        memory += value;
        return value;
    }
    public void memoryMinus(double value, double num2) {
        memory -= value;
    }
    public void memoryStore(double value, double num2) {
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

}

