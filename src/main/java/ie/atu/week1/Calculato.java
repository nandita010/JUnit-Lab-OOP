package ie.atu.week1;

public class Calculato {

    public int div(int firstNum, int secondNum) {
        if (secondNum == 0)
            throw new ArithmeticException("Number cannot be divided by 0");
        int result = firstNum / secondNum;
        return result;
    }

}