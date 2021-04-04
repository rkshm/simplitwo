package main.day4.exception;

public class CustomException {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age is not valid. Person cannot vote");
        else
            System.out.println("Person can vote");
    }

    public static void main(String[] args) {
        try {
            validate(17);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("Rest of the code .... ");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
