/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zaph
 */
public class CalculadoraTest {

    static Calculadora calc;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
        calc = new Calculadora();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass()");
        calc = new Calculadora();
    }

    @Before
    public void before() {
        System.out.println("before()");
        calc = new Calculadora();
    }

    @After
    public void after() {
        System.out.println("after()");
        calc.clear();
    }

    @Test
    public void testSum() {
        System.out.println("sum()");
        int resul = calc.add(3, 2);
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testAnsSum() {
        System.out.println("ansSum()");
        calc.add(3, 2);
        int resul = calc.ans();
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testDiv() {
        System.out.println("testDiv()");
        calc.div(5, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        System.out.println("testDivPorCero()");
        calc.div(5, 0);
    }

    @Test(timeout = 3000)
    public void testAlgoritmoOptimo() {
        System.out.println("testAlgoritmoOptimo()");
        calc.operacionOptima();
    }

    @Test
    public void testMulti() {
        System.out.println("multi()");
        int resul = calc.multi(3, 2);
        int esper = 6;
        assertEquals(esper, resul);
    }
}
