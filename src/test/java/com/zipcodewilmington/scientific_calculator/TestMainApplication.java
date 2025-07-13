package com.zipcodewilmington.scientific_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.zipcodewilmington.scientificcalculator.CoreFeatures;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    private CoreFeatures calculator;

    //set delta for comparisons 
    //assert equals (double expected, double actual, double delta)
    private static final double DELTA =1e-6;
    
    @Before
    public void setUp() {
        calculator=new CoreFeatures();

    }

    @Test 
    //Display initial 
    public void testInitialDisplay() {
        assertEquals (0.0,calculator.getDisplayValue(),DELTA);
    }

    @Test 
    //Display clear
    public void testClear() {
        calculator.setDisplay(100);
        calculator.clear();
        assertEquals(0.0,calculator.getDisplayValue(),DELTA);

    }

    @Test
    //Display 
    public void testSetDisplay (){
        calculator.setDisplay(182);
        assertEquals(182,calculator.getDisplayValue(),DELTA);

    }

    @Test
    //addition 
    public void testAdd() {
        calculator.add(10);
        assertEquals(10, calculator.getDisplayValue(),DELTA);
        calculator.add(5);
        assertEquals(15, calculator.getDisplayValue(), DELTA);
    }

    @Test 
    //subtraction 
    public void testSubtract() {
        calculator.setDisplay(10);
        calculator.subtract(5);
        assertEquals(5.0,calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //multiplication 
    public void testMultiplication() {
        calculator.setDisplay(5);
        calculator.multiply(5);
        assertEquals(25,calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //division
    public void testDivision() {
        calculator.setDisplay(20);
        calculator.divide(5);
        assertEquals(4.0,calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //square
    public void testSquare() {
        calculator.setDisplay(5);
        calculator.square();
        assertEquals(25.0,calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //square root
    public void testRoot() {
        calculator.setDisplay(25);
        calculator.squareRoot();
        assertEquals(5.0,calculator.getDisplayValue(),DELTA);
    }

    @Test
    //exponent 
    public void testExponent() {
        calculator.setDisplay(3);
        calculator.exponentiation(2);
        assertEquals(9.0,calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //inverse
    public void testInverse() {
        calculator.setDisplay(5);
        calculator.inverse();
        assertEquals(0.20, calculator.getDisplayValue(),DELTA);

    }

    @Test 
    //invert sign
    public void testInvertSign() {
        calculator.setDisplay(10);
        calculator.inverseSign();
        assertEquals(-10.0, calculator.getDisplayValue(),DELTA);

    }
    @Test
    //new feature percentage of a number 
    public void testPercentageOfNum() {
        calculator.setDisplay(100);
        calculator.percentage(50);
        assertEquals(50.0, calculator.getDisplayValue(), DELTA);
    }

    @Test
    //new feature turn decimal into a percentage
    public void testDecimalToPercent() {
        calculator.setDisplay(0.50);
        calculator.decimalToPercentage();
        assertEquals(50.0, calculator.getDisplayValue(),DELTA);
    }

}
