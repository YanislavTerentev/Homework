package by.academy.HomeWork.HomeWork4;

import java.util.Comparator;

public class AnimalAgeComparator  implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() > o2.getAge() ? -1 : 0;
    }
}
