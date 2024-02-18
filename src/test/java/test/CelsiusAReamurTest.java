/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import es.dam.temperatura.Temperatura;

public class CelsiusAReamurTest {
    
    // Returns the correct Reamur temperature when given a valid Celsius temperature.
    @Test
    public void test_valid_celsius_temperature() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(25.0);
        assertEquals(20.0, result, 0.001);
    }

    // Returns 0 when given a Celsius temperature of 0.
    @Test
    public void test_celsius_temperature_zero() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(0.0);
        assertEquals(0.0, result, 0.001);
    }

    // Returns the correct Reamur temperature when given the maximum Celsius temperature (537.78).
    @Test
    public void test_maximum_celsius_temperature() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(537.78);
        assertEquals(430.224, result, 0.001);
    }

    // Returns 999999 and prints an error message when given a Celsius temperature below absolute zero (-273.15).
    @Test
    public void test_celsius_temperature_below_absolute_zero() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(-300.0);
        assertEquals(999999.0, result, 0.001);
    }

    // Returns the correct Reamur temperature when given the maximum valid Celsius temperature (537.79).
    @Test
    public void test_maximum_valid_celsius_temperature() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(537.79);
        assertEquals(430.232, result, 0.001);
    }

    // Returns the correct Reamur temperature when given the minimum valid Celsius temperature (-273.14).
    @Test
    public void test_minimum_valid_celsius_temperature() {
        Temperatura temperatura = new Temperatura();
        double result = temperatura.celsiusAReamur(-273.14);
        assertEquals(-218.512, result, 0.001);
    }
    
}
