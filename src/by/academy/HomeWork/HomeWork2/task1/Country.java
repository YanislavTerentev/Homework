package by.academy.HomeWork.HomeWork2.task1;

public enum Country implements ICountry {
    Sweden(450295, 10000000),
    Poland(312568, 38167000),
    Switzerland(41285, 8570000),
    Germany(357021, 81802000),
    Belarus(207600, 9468000),
    Ukraine(603628, 42220000),
    Grecee(131940, 11306000),
    Norway(38520, 5368000),
    China(9596960, 1339450000);

    private double area;
    private int numberOfPeople;

    Country(int area, int numberOfPeople) {
        this.area = area;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
