package mypkg;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculator calculator = new Calculator();

    @Test
    public void testadd1()
    {
        int result = calculator.add(-3, -4);
        assertEquals(-7, result);
    }

    @Test
    public void testadd2()
    {
        int result = calculator.add(1000, 10000);
        assertEquals(11000, result);
    }

    @Test
    public void testsubtract1()
    {
        int result = calculator.subtract(12, 20);
        assertEquals(-8, result);
    }

    @Test
    public void testsubtract2()
    {
        int result = calculator.subtract(9000, 3000);
        assertEquals(6000, result);
    }

    @Test
    public void testmultipy1()
    {
        int result = calculator.multipy(-3, 6);
        assertEquals(-18, result);
    }

    @Test
    public void testmultipy2()
    {
        int result = calculator.multipy(1234, 5678);
        assertEquals(7006652, result);
    }
}
