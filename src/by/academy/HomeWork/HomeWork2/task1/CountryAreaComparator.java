package by.academy.HomeWork.HomeWork2.task1;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if (o1.getArea() < o2.getArea()) {
            return 0;
        }
        if (o1.getArea() > o2.getArea()) {
            return 1;
        }
        return -1;
    }

    public void comp(Country o1, Country o2) {
        if (compare(o1, o2) == 0) {
            System.out.println(o1 + " less than " + o2);
        } else if (compare(o1, o2) > 0) {
            System.out.println(o1 + " more than " + o2);
        } else if (compare(o1, o2) < 0) {
            System.out.println(o1 + " equal " + o2);
        }
    }
}
