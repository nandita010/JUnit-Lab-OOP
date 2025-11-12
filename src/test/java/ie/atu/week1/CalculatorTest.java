package ie.atu.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest { //click the run button here

    Calculato calc;

    @BeforeEach
    public void setup() {
        calc = new Calculato();
    }

    @Test
    public void testMul_Success() {

        assertEquals(32, calc.mul(8, 4)); //alt+enter to import library

    }
@Test
    public void testMul_Failure() {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.mul(Integer.MAX_VALUE,1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }

}
