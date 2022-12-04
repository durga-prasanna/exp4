package acoecsea.maven2cseb;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() 
    {
   App a=new App();
   int actual=a.sum(10,20);
   int expected=30;
   assertEquals(expected,actual);
   }
}
