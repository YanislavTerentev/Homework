package by.academy.HomeWork.HomeWork6;

public class StackOverflowErrorMain {
    public static void main(String[] args) {
        badCodingPractice(true);
    }

    private static void badCodingPractice(boolean isbadCoding) {
        badCodingPractice(isbadCoding);
    }
}
