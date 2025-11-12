package ie.atu.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest { //click the run button here

    Calculato calc;

    @BeforeEach
    public void setup()
    {
        calc = new Calculato();
    }

    @Test
    public void testAdd_Success(){

        assertEquals(20, calc.add(16,4)); //alt+enter to import library

    }

    @Test
    public void testSub_Success(){

        assertEquals(12, calc.sub(16,4)); //alt+enter to import library

    }

    @Test
    public void testMultiply_Success(){

        assertEquals(64, calc.mul(16,4)); //alt+enter to import library

    }

    @Test
    public void testDivide_Success(){

        assertEquals(4, calc.div(16,4)); //alt+enter to import library

    }

}
