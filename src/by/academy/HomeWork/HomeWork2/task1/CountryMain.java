package by.academy.HomeWork.HomeWork2.task1;

public class CountryMain {
    public static void main(String[] args) {

        Country country = Country.Poland;

        Country country1 = Country.valueOf("Poland");
        System.out.println(country1);

        Country country2 = Country.Belarus;
        System.out.println(country2);
        System.out.println(country1 == country2);


        System.out.println(country.compareTo(country2));
        System.out.println(country.compareTo(country1));

        CountryAreaComparator areaComparator = new CountryAreaComparator();
        areaComparator.comp(country1, country2);
        //System.out.println(areaComparator.compare(country1, country2));

    }

}
