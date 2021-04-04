public class DataTypeTrial {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // ----- TYPECAST BETWEEN INT AND LONG//
        int i = 100;
        long l = 70000; //automatic type conversion from int to long
        System.out.println("long value: " + l);

        int o = (int) l; //explicit typecast from long to int
        System.out.println("int value: " + o);

        char t = (char) i;
        System.out.println("char value: " + t);

        // ----- TYPECAST BETWEEN DOUBLE AND FLOAT//
        double d = 190.00;
        float r = (float) d;
        System.out.println("float value: " + r);
        System.out.println("double value: " + d);

        // ----- TYPECAST BETWEEN DOUBLE  --> LONG --> INT//
        double d2 = 100090909.046543;
        long l2 = (long) d2;
        int i2 = (int) l2;
        System.out.println("double value: " + d2);
        System.out.println("long value: " + l2);
        System.out.println("int value: " + i2);
    }
}
