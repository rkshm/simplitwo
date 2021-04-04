package main.day3.inner;

public class InnerExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass. new InnerClass();
        innerClass.msg(); //will call display of inner
        innerClass.display(); //direct call to display of inner
        outerClass.display(); //direct call to display of outer
    }
}

class OuterClass {
    private int data = 30;
    void display() {
        System.out.println("In the outer class method");
    }

    class InnerClass {

        //private int data = 20;
        void msg() { //inner class accessing outer class variable
            System.out.println("data is : " + data);
            display();
        }

        void display() {
            System.out.println("In the inner class method");
        }
    }
}
