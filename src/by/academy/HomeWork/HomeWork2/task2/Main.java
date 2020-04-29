package by.academy.HomeWork.HomeWork2.task2;

public class Main {
    public static void main(String[] args) {
        FindNumber f = new FindNumber();
        Integer[] array1 = new Integer[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        Integer[] array2 = new Integer[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        Integer[] array3 = new Integer[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        Integer[] array4 = new Integer[]{10};
        Integer[] array5 = new Integer[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        Integer[] array6 = new Integer[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        System.out.print("Array 1: ");
        f.search(array1);
        System.out.print("Array 2: ");
        f.search(array2);
        System.out.print("Array 3: ");
        f.search(array3);
        System.out.print("Array 4: ");
        f.search(array4);
        System.out.print("Array 5: ");
        f.search(array5);
        System.out.print("Array 6: ");
        f.search(array6);
    }
}
