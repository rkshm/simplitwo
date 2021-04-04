package main.day1.accessmodifier;

public class TestA {
    private int y = 10; //private variable
    long k = 1000; //default variable

    public void methodPublic() { //protected method
        methodPrivate();
    }

    protected void methodProtected() { //protected method
        methodPrivate();
    }

    void methodDefault() { //protected method
        methodPrivate();
    }

    private void methodPrivate() { //protected method
        System.out.println("Class TestA: methodPrivate");
        System.out.println("Value of private value y: " + y);
        System.out.println("Value of long: " + k);
    }
}
