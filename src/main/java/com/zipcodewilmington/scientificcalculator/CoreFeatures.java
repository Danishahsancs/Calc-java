package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures {
    
    //a state represening the value currently displayed on the calc 
    private double displayValue;

    //Update the display to ERR if an error occurs (ex: divide by 0)
    private boolean errorState;

    //initiate calculator with 0 as default 
    public CoreFeatures () {
        this.displayValue = 0.0;
        //not an ERR
        this.errorState=false;

    }

    //Get the current # on the display 
    public double getDisplayValue() {
        //pull the display value 
        return this.displayValue;
    }

    //Check for errors
    public boolean inErrorState() {
        //pull the error state (is it true or false)
        return this.errorState;
    }

    //Set display to the number entered 
    public void setDisplay (double value) {
        //(if ERR, skip the equation)
        if (checkError()) return;
        //reset the display value to the number entered
        this.displayValue=value;

    }
  
    //Clear the display
      public void clear () {

        //set display to 0 and remove error
        this.displayValue=0.0;
        this.errorState=false;


        // Clear terminal by printing lines to simulate clearing
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("Cleared");
      }
    

    //Add (if ERR, skip the equation)
    public void add(double number) {
        if (checkError()) return;
        this.displayValue+=number;
    }


    //Subtract (if ERR, skip the equation)
    public void subtract (double number) {
        if (checkError()) return;
        this.displayValue -= number;
    }

    //Multiply (if ERR, skip the equation)
    public void multiply (double number) {
        if (checkError()) return;
        this.displayValue *= number;
    }

    //Divide (if ERR, skip the equation)
    public void divide(double number) {
        if (checkError()) return;
        if(number ==0) {
            setError();
            return;
        }
        this.displayValue/=number;
    }

    //Caclulate the square (if ERR, skip the equation) 
    public void square () {
        if (checkError()) return;
        this.displayValue=this.displayValue*this.displayValue;
    }

    //Calculate the square root (if ERR, skip the equation)
    public void squareRoot() {
        if (checkError()) return;
        if (this.displayValue<0) {
            setError();
            return;
        }
        this.displayValue=Math.sqrt((this.displayValue));
    }
    
    //Calculate the variable exponentiation (if ERR, skip the equation)
    public void exponentiation(double exponent) {
        if (checkError()) return;
        this.displayValue=Math.pow(this.displayValue, exponent);
    }

    //Calculate the inverse of the number (if ERR, skip the equation)
    public void inverse() {
        if (checkError()) return;
        if (this.displayValue==0) {
            setError();
            return;
        }
        this.displayValue=1/this.displayValue;
    }

    //Caclulate the percentage of another number  NEW FEATURE #1
    public void percentage(double percent) {
        if (checkError()) return;
        this.displayValue = (percent/this.displayValue)*100;

    }

    //Takes a decimal and returns the percentage NEW FEATURE #2
    public void decimalToPercentage () {
        if (checkError()) return;
        this.displayValue*=100;

    }

    //Invert the sign of the number (switch between postive and negative)
    //(if ERR, skip the equation)
    public void inverseSign() {
        if (checkError()) return;
        this.displayValue=-this.displayValue;
    
    }


    //Set an error state so we can use it to compare 
    private void setError() {
        this.errorState=true; 
    }

    //check for an error before operation 
    private boolean checkError() {
        if (this.errorState) {
            System.out.println("ERR");
            return true;
        }
        return false;
    }


}
