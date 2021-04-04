package main.day4.exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[4] = (30/0);
            a[5] = 9;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred");
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception ae) {
            System.out.println("Parent Exception occurred");
        }

        System.out.println("rest of the code");
    }
}
