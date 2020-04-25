package by.academy.HomeWork.HomeWork2.task3;

public class CalculatorWithOperator implements ICalculator{
    @Override
    public double getAddition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double getSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double getMultiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double getDivision(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public double getExponentiation(double number, double power) {
        double result = 1;
        if (power == 0) {
            return 1;
        }
        if (power > 0) {
            for (int i = 0; i < power; i++) {
                result *= number;
            }
        } else {
            for (int i = 0; i < power; i++) {
                result *= 1 / number;
            }
        }
        return result;

    }

    @Override
    public double getModule(double number) {
        if (number >= 0) {
            return number;
        } else {
            return (-1) * number;
        }
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {
        double exp = 0.00001;
        double result = 1;
        double a = 0;
        double b = number;
        double t;
        do {
            t = (a + b) / 2.0;
            result = getExponentiation(t, power);
            if (result - number > 0) {
                b = t;
            } else {
                a = t;
            }
        } while (getModule(result - number) > exp);

        return t;
    }

}
