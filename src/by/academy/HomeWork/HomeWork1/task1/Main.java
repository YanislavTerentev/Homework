package by.academy.HomeWork.HomeWork1.task1;

import by.academy.HomeWork.HomeWork1.task1.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        float result = (float) calc.getAddition(calc.getAddition(4.1, calc.getMultiplication(15, 7)), calc.getDegreeOf(calc.getDivision(28, 5), 2));
        System.out.println("result= " + result);
    }
}
