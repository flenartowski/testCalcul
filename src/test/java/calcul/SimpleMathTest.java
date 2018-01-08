/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francoise
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
    }

    /**
     * Test of add method, of class SimpleMath.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = SimpleMath.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class SimpleMath.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 3;
        int b = 2;
        int expResult = 6;
        int result = SimpleMath.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class SimpleMath.
     */
    @org.junit.Test
    public void testDivide() {
        System.out.println("divide");
        int a = 4;
        int b = 0;
       int expResult = 0;
       int result = SimpleMath.divide(a, b);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("division par zéro");
    }
    
}
