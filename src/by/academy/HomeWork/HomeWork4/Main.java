package by.academy.HomeWork.HomeWork4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int counter = 10;
        Person[] person = new Person[counter];
        DataContainer<Person> dataContainerPerson = new DataContainer<>(person);
        for (int i = 0; i < person.length; i++) {
            dataContainerPerson.add(new Person(setNick(), setPassword(), setRegistration()));
        }

        System.out.println("Person : ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        DataContainer.sort(dataContainerPerson, new PersonRegistrationComparator());
        System.out.println("Person sort: ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        dataContainerPerson.delete(1);
        System.out.println("Person container delete: ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        compareDates(person[0], person[1]);

        System.out.println("Animal :");
        Animal[] animal = new Animal[counter];
        DataContainer<Animal> dataContainerAnimal = new DataContainer<>(animal);
        for (int i = 0; i < animal.length; i++) {
            dataContainerAnimal.add(new Animal(setNick(), setAge()));
        }
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));
        compareAge(animal[0], animal[1]);

        DataContainer.sort(dataContainerAnimal, new AnimalAgeComparator());
        System.out.println("Animal sort:");
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));

        System.out.println("Animal delete:");
        dataContainerAnimal.delete(animal[0]);
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));

    }

    private static String setNick() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Number;
        char N;
        String variableString = new String();
        for (int l = 0; l < 10; l++) {
            Number = (int) (Math.random() * 26);
            N = alphabet.charAt(Number);
            variableString += N;

        }
        return variableString;
    }

    private static String setPassword() {
        String password = "0123456789";
        int Number;
        char P;
        String variableString = new String();
        for (int l = 0; l < 10; l++) {
            Number = (int) (Math.random() * 9);
            P = password.charAt(Number);
            variableString += P;
        }
        return variableString;
    }

    private static LocalDate setRegistration() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1920, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate registrationDate = LocalDate.ofEpochDay(randomDay);
        return registrationDate;
    }

    private static int setAge() {
        int age;
        age = (int) (1 + Math.random() * 50);
        return age;
    }

    private static void compareDates(Person o1, Person o2) {
        PersonRegistrationComparator registrationComparator = new PersonRegistrationComparator();
        switch (registrationComparator.compare(o1, o2)) {
            case 1: {
                System.out.println("Data registration " + o1.nick + " is after " + o2.nick);
                break;
            }
            case 0: {
                System.out.println("Data registration " + o2.nick + " is after " + o1.nick);
                break;
            }
            case -1: {
                System.out.println("Dates registration are the same");
                break;
            }

        }
    }

    private static void compareAge(Animal o1, Animal o2) {
        AnimalAgeComparator ageComparator = new AnimalAgeComparator();
        switch (ageComparator.compare(o1, o2)) {
            case 1: {
                System.out.println("Animal :"+ o1.nick + " is older than Animal :"+ o2.nick);
                break;
            }
            case 0: {
                System.out.println("Animal :" + o2.nick + " is older than Animal :"+ o1.nick);
                break;
            }
            case 2: {
                System.out.println(o2.nick + " and " + o1.nick + " are peers");
                break;

            }
            case -1: {
                System.out.println("Oops");
                break;
            }

        }
    }
}
