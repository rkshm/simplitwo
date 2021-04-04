package main.day4.exception;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = 20;
        num2 = 0;

        try {
            num3 = num1 / num2;
            System.out.println("No exception occurred. Result of division is: " + num3);
        } catch (ArithmeticException ae) {
            System.out.println("Numbers cannot be divided by zero");
            System.out.println("ArithmeticException occurred" + ae);
        } catch (Exception e) {
            System.out.println("Exception occurred" + e);
        } finally {
            System.out.println("finally block will always be executed");
        }

        num3 = num1 + num2;
        System.out.println("Result after addition is: " + num3);
    }
}
