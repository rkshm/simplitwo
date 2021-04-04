package main.day4.exception;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try {
            int num3 = num1 / num2;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred" + ae);
        } catch (Exception e) {
            System.out.println("Exception occurred" + e);
        } finally {
            System.out.println("In finally");
        }
    }
}
