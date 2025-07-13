package com.zipcodewilmington.scientificcalculator;

public class ScientificCalc {
    Double memvalue;
    String DisplayMode;
    int modeIndex;
    boolean isDegrees;


    public ScientificCalc(){
        memvalue = 0.0;
        DisplayMode = "decimal";
        modeIndex = 0;
        isDegrees = false;
    }

    public void switchDisplayMode(){
        if(modeIndex == 3){
            modeIndex = 0;
        }else{
            modeIndex++;
        }

        switch (modeIndex) {
            case 0:
                DisplayMode = "decimal";
                System.out.println("set to:" + DisplayMode);
                break;
            case 1:
                DisplayMode = "hexadecimal";
                System.out.println("set to:" + DisplayMode);
                break;
            case 2:
                DisplayMode = "binary";
                System.out.println("set to:" + DisplayMode);
                break;
            case 3:
                DisplayMode = "octal";
                System.out.println("set to:" + DisplayMode);
                break;
            default:
                break;
        }

    }

    public String getDisplayMode(){
        return DisplayMode;
    }

    public void switchDisplayMode(String s){
        switch (s.toLowerCase()) {
            case "decimal":
                modeIndex = 0;
                DisplayMode = s;
                break;
            case "hexadecimal":
                modeIndex = 1;
                DisplayMode = s;
                break;
            case "binary":
                modeIndex = 2;
                DisplayMode = s;
                break;
            case "octal":
                modeIndex = 3;
                DisplayMode = s;
                break;
            default:
                System.out.println(s + " is not valid. Setting to decimal mode\n");
                modeIndex = 0;
                DisplayMode = "decimal";
                break;
        }

    }

    public void memmoryFunctions(double curValue, String memoryFunction){
        switch (memoryFunction.toLowerCase()) {
            case "m+":
                memvalue = curValue;
                break;
            case "mc":
                memvalue = 0.0;
                System.out.println("memory reset\n");
                break;
            case "mrc":
                System.out.println("value in memory: "+memvalue);
            default:
                break;
        }
    }

    public Double mrc(){
        return memvalue;
    }

    public double sine(Double x){
        if(isDegrees){
            return Math.sin(Math.toRadians(x));
        }else{
            return Math.sin(x);
        }
    }
    public double cosine(Double x){
         if(isDegrees){
            return Math.cos(Math.toRadians(x));
        }else{
            return Math.cos(x);
        }
    }
    public double tangent(Double x){
         if(isDegrees){
            return Math.tan(Math.toRadians(x));
        }else{
            return Math.tan(x);
        }
    }
    public double inverseSine(Double x){
    if(isDegrees){
        return Math.toDegrees(Math.asin(x));
    }else{
        return Math.asin(x);
    }
}
public double inverseCosine(Double x){
    if(isDegrees){
        return Math.toDegrees(Math.acos(x));
    }else{
        return Math.acos(x);
    }
}
public double inverseTangent(Double x){
    if(isDegrees){
        return Math.toDegrees(Math.atan(x));
    }else{
        return Math.atan(x);
    }
}

    public void switchUnitsMode(){
        if(isDegrees){
            System.out.println("set to radians");
            isDegrees = false;
        }else{
            System.out.println("set to degrees");
            isDegrees = true;
        }
    }

    public void switchUnitsMode(String s){
        if(s.toLowerCase() == "degree"){
            System.out.println("set to degrees");
            isDegrees = true;
        }else if (s.toLowerCase() == "radians"){
            System.out.println("set to radians");
            isDegrees = false;
        }else{
            System.out.println("invalid input defaulted to radians");
            isDegrees = false;
        }
    }

    public double log(Double x){
        return Math.log10(x);
    }

    public double inverseLog(Double x){
        return Math.pow(10,x);
    }

    public double naturalLog(Double x){
        return Math.log(x);
    }
    public double inverseNaturalLog(Double x){
        return Math.exp(x);
    }

    public double factorial(Double x){
        return factorialFunction(x);
    }

    public Double factorialFunction(Double x){
        if(x<=1)
            return 1.0;
        
        return x * factorialFunction(x-1);
    }

}
