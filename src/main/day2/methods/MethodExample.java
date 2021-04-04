package main.day2.methods;

public class MethodExample {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b); //actual arguments
        System.out.println("Minimum value : " + c);
    }

    /** returns the minimum of two numbers */
    public static int minFunction(int n1, int n2) { //formal arguments
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

}
