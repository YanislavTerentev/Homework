package by.academy.HomeWork.HomeWork4;

public class Animal {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal(" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                ')';
    }
}
