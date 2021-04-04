package main.day4.inner;

class Outer {
    void outerMethod() {
        System.out.println("inside outerMethod");

        //Inner class is local to outerMethod()
        class Inner {
            Inner() {} //calling constructor
            void innerMethod() {
                System.out.println("inside innerMethod");
                f(); //calling outer class method here
            }
        }
        Inner y = new Inner(); //object creation of the local innerClass
        y.innerMethod(); //calling inner class method
    }

    public void f() {
        System.out.println("I am inside the f method");
    }
}

public class MethodLocalInner {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod(); //calling outer class method
    }
}
