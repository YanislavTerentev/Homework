package by.academy.HomeWork.HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWorkExceptionMain {
    public static void main(String[] args) {

        int result;
        int n = 0;
        do {
            try {
                n++;
                System.out.println("Введите любое целое число от 1 до 10: ");
                result = input();
                if (0 < result && result <= 10) {
                    System.out.println("Введенное число подходит");
                    System.exit(0);
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                if (n < 3) {
                    System.err.println("Введеное число не подходит(либо введено не число). Попробуйте еще раз" );
                }
            }
        }
        while (n < 3);
        throw new IllegalArgumentException("Oops!! Попыток больше нет");
    }

    public static int input() {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (0 < i && i <= 10) {
            return i;
        } else {
            scan.close();

            throw new IllegalArgumentException();
        }
    }
}
