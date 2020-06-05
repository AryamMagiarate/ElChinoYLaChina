/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcalculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayra M.F
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 1.55;
        double b = 2.3;
        double expResult = 3.85;
        double result = Calculadora.suma(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 5.22;
        double b = 1.0;
        double expResult = 4.22;
        double result = Calculadora.resta(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 5.1;
        double b = 2.0;
        double expResult = 10.2;
        double result = Calculadora.multiplicacion(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 5;
        double b = 2;
        double expResult = 2.5;
        double result = Calculadora.division(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPotencia() {
        System.out.println("potencia");
        double a = 2.0;
        double b = 3.0;
        double expResult = 8.0;
        double result = Calculadora.potencia(a, b);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.

    }

    
}
