package by.academy.HomeWork.HomeWork6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

public class OutOfMemoryErrorMain {
    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
            Random random = new Random();

            while (true)
                list.add(random.nextInt());
        }catch (OutOfMemoryError| IllegalArgumentException | InputMismatchException e){
            System.err.println("You have problem with memory");
        }
    }
}
