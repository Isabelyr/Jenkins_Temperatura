/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import es.dam.temperatura.Temperatura;

public class TemperaturaTest {
    
     public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    @org.junit.jupiter.api.Test
    public void testCelsiusAFahrenheitFunciona() {
        System.out.println("celsiusAFahrenheit");
        double celsius = 25.0;
        Temperatura instance = new Temperatura();
        double expResult = 77.0;
        double result = instance.celsiusAFahrenheit(celsius);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCelsiusAFahrenheitNoFunciona() {
        System.out.println("celsiusAFahrenheit");
        double celsius = 20.0;
        Temperatura instance = new Temperatura();
        double expResult = 77.0;
        double result = instance.celsiusAFahrenheit(celsius);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    @org.junit.jupiter.api.Test
    public void testCelsiusAReamurFunciona() {
        System.out.println("celsiusAReamur");
        double celsius = 77.0;
        Temperatura instance = new Temperatura();
        double expResult = 61.6;
        double result = instance.celsiusAReamur(celsius);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testCelsiusAReamurNoFunciona() {
        System.out.println("celsiusAReamur");
        double celsius = 50;
        Temperatura instance = new Temperatura();
        double expResult = 61.6;
        double result = instance.celsiusAReamur(celsius);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
