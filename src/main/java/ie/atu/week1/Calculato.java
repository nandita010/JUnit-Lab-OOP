package ie.atu.week1;

public class Calculato {

    public int sub(int firstNum, int secondNum) {
        if (firstNum <= Integer.MIN_VALUE ||secondNum <= Integer.MIN_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MIN_VALUE");
        int result = firstNum - secondNum;
        return result;
    }

}