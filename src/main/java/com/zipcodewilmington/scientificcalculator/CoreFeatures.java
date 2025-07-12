package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures {
    
    //a state represening the value currently displayed on the calc 
    private double displayValue;

    //Update the display to ERR if an error occurs (divide by 0)
    private boolean errorState;

    //initiate calculator with 0 as default 
    public CoreFeatures () {
        this.displayValue = 0.0;
        this.errorState=false;

    }

    //Get the current # on the display 
    public double getDisplayValue() {
        return this.displayValue;
    }

    //Check for errors
    public boolean inErrorState() {
        return this.errorState;
    }

    //Set display to the number entered 
    // block errors 
    public void setDisplay (double value) {
        if (checkError()) return;
        this.displayValue=value;

    }
  
    //Clear the display
      public void clear () {
        this.displayValue=0.0;
        this.errorState=false;
        System.out.println("Cleared");
      }
    

    //Add
    public void add(double number) {
        if (checkError()) return;
        this.displayValue+=number;
    }


    //Subtract
    public void subtract (double number) {
        if (checkError()) return;
        this.displayValue -= number;
    }

    //Multiply 
    public void multiply (double number) {
        if (checkError()) return;
        this.displayValue *= number;
    }

    //Divide 
    public void divide(double number) {
        if (checkError()) return;
        if(number ==0) {
            setError();
            return;
        }
        this.displayValue/=number;
    }

    //Caclulate the square 
    public void square () {
        if (checkError()) return;
        this.displayValue=this.displayValue*this.displayValue;
    }

    //Calculate the square root
    public void squareRoot() {
        if (checkError()) return;
        if (this.displayValue<0) {
            setError();
            return;
        }
        this.displayValue=Math.sqrt((this.displayValue));
    }
    
    //Calculate the variable exponentiation 
    public void exponentiation(double exponent) {
        if (checkError()) return;
        this.displayValue=Math.pow(this.displayValue, exponent);
    }

    //Calculate the inverse of the number
    public void inverse() {
        if (checkError()) return;
        if (this.displayValue==0) {
            setError();
            return;
        }
        this.displayValue=1/this.displayValue;
    }

    //Invert the sign of the number (switch between postive and negative)
    public void inverseSign() {
        if (checkError()) return;
        this.displayValue=-this.displayValue;
    
    }


    //Check and set error
    private void setError() {
        this.errorState=true; 
    }
    private boolean checkError() {
        if (this.errorState) {
            System.out.println("ERR");
            return true;
        }
        return false;
    }

}
