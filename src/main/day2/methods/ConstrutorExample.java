package main.day2.methods;

public class ConstrutorExample {

    int id; //class variables
    String name;

    public ConstrutorExample() {
        id = 10;
        name = "hello";
        System.out.println("I am inside the default constructor");
    }

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects

        ConstrutorExample s2 = new ConstrutorExample(); //object of class
        s2.display();
    }
}
