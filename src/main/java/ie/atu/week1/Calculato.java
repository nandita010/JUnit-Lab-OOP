package ie.atu.week1;

public class Calculato {

    public int mul(int firstNum, int secondNum) {
        if (firstNum >= Integer.MAX_VALUE ||secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        int result = firstNum * secondNum;
        return result;
    }

}