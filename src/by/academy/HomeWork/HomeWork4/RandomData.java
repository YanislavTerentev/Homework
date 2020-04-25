package by.academy.HomeWork.HomeWork4;

import java.time.LocalDate;

public class RandomData {
    public String getNick() {

        String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 25)));
        }

        return builder.toString();
    }

    public String getPersonPassword() {
        String letters = "0123456789";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 9)));
        }

        return builder.toString();
    }

    public LocalDate getPersonRegistration() {
        LocalDate minDate = LocalDate.of(1950, 1, 1);
        LocalDate maxDate = LocalDate.of(2020, 1, 1);
        long a = (long) (Math.random() * (maxDate.toEpochDay() - minDate.toEpochDay()));

        return maxDate.minusDays(a);
    }

    public int getAge() {
        return (int) (Math.random() * 50+ 1);
    }
}
