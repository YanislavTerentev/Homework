package by.academy.HomeWork.HomeWork4;

import java.time.LocalDate;

public class Person {
    private String nick;
    private String password;
    private LocalDate registration;


    public Person(String nick, String password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "Person(" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", registration=" + registration +
                ')';
    }
}
