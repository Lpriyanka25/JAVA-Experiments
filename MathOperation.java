// Custom Exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Custom exceptions for different operations
class TooLongAddition extends MyException {
    public TooLongAddition(String message) {
        super(message);
    }
}

class NegativeAnswer extends MyException {
    public NegativeAnswer(String message) {
        super(message);
    }
}

class TooLongMultiplication extends MyException {
    public TooLongMultiplication(String message) {
        super(message);
    }
}

// MathOperation class
class MathOperation {
    
    // Method for addition
    public int add(int a, int b) throws TooLongAddition {
        int result = a + b;
        if (result > 1000) {
            throw new TooLongAddition("Addition result exceeded 1000: " + result);
        }
        return result;
    }

    // Method for subtraction
    public int subtract(int a, int b) throws NegativeAnswer {
        int result = a - b;
        if (result < 0) {
            throw new NegativeAnswer("Subtraction resulted in a negative answer: " + result);
        }
        return result;
    }

    // Method for multiplication
    public int multiply(int a, int b) throws TooLongMultiplication {
        int result = a * b;
        if (result > 5000) {
            throw new TooLongMultiplication("Multiplication result exceeded 5000: " + result);
        }
        return result;
    }

    // Method for division
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();

        try {
            // Testing addition
            System.out.println("Addition: " + mathOp.add(500, 600)); // Should trigger TooLongAddition

        } catch (TooLongAddition e) {
            System.out.println(e.getMessage());
        }

        try {
            // Testing subtraction
            System.out.println("Subtraction: " + mathOp.subtract(100, 200)); // Should trigger NegativeAnswer

        } catch (NegativeAnswer e) {
            System.out.println(e.getMessage());
        }

        try {
            // Testing multiplication
            System.out.println("Multiplication: " + mathOp.multiply(100, 60)); // Should trigger TooLongMultiplication

        } catch (TooLongMultiplication e) {
            System.out.println(e.getMessage());
        }

        try {
            // Testing division
            System.out.println("Division: " + mathOp.divide(100, 0)); // Should trigger ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
