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
        calculator.divide(0);
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

    }

    @Test 
    //square
    public void testSquare() {

    }

    @Test 
    //square root
    public void testRoot() {

    }

    @Test
    //exponent 
    public void testExponent() {

    }

    @Test 
    //inverse
    public void testInverse() {

    }

    @Test 
    //invert 
    public void testInvert() {

    }

    @Test 
    //display ERR
    public void testError() {

    }



}
