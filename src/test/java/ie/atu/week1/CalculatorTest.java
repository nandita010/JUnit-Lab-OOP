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
    public void testDiv_Success() {

        assertEquals(2, calc.div(8, 4)); //alt+enter to import library

    }
@Test
    public void testDiv_Failure() {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.div(Integer.MAX_VALUE, 0));
        assertEquals("Number cannot be divided by 0", ex.getMessage());
    }

}
