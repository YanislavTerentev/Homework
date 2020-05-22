package by.academy.HomeWork.HomeWork6;

public class StackOverflowErrorMain {
    public static void main(String[] args) {
        class Person {
            String name;
            Person person = new Person();
        }


    try {
        Person person = new Person();
    } catch (StackOverflowError e) {
        System.err.println("Oops! You have StackOverflowError");
    }
}
}



