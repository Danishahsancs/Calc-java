package main.java.com.zipcodewilmington.scientificcalculator;

public class ScientificCalc {
    Double memvalue;
    String DisplayMode;
    int modeIndex;
    boolean isDegrees;


    public ScientificCalc(){
        memvalue = 0;
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
                break;
            case 1:
                DisplayMode = "hexadecimal";
                break;
            case 2:
                DisplayMode = "binary";
                break;
            case 3:
                DisplayMode = "octal";
                break;
            default:
                break;
        }

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
                memvalue = 0;
                System.out.println("memory reset\n");
                break;
            case "mrc":
                System.out.println("value in memory: "+memvalue);
            default:
                break;
        }
    }

    public void sine(Double x){
        if(isDegrees){
            System.out.println(Math.sin(Math.toRadians(x)));
        }else{
            System.out.println(Math.sin(x));
        }
    }
    public void cosine(Double x){
         if(isDegrees){
            System.out.println(Math.cos(Math.toRadians(x)));
        }else{
            System.out.println(Math.cos(x));
        }
    }
    public void tangent(Double x){
         if(isDegrees){
            System.out.println(Math.tan(Math.toRadians(x)));
        }else{
            System.out.println(Math.tan(x));
        }
    }
    public void inverseSine(Double x){
         if(isDegrees){
            System.out.println(Math.asin(Math.toRadians(x)));
        }else{
            System.out.println(Math.asin(x));
        }
    }
    public void inverseCosine(Double x){
         if(isDegrees){
            System.out.println(Math.acos(Math.toRadians(x)));
        }else{
            System.out.println(Math.acos(x));
        }
    }
    public void inverseTangent(Double x){
         if(isDegrees){
            System.out.println(Math.atan(Math.toRadians(x)));
        }else{
            System.out.println(Math.atan(x));
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

    public void log(Double x){
        System.out.println(Math.log10(x));
    }

    public void inverseLog(Double x){
        System.out.println(Math.pow(10,x));
    }

    public void naturalLog(Double x){
        System.out.println(Math.log(x));
    }
    public void inverseNaturalLog(){
        System.out.println(Math.exp(x));
    }

    public void factorial(Double x){
        System.out.println(factorialFunction(x));
    }

    public Double factorialFunction(Double x){
        if(x<=1)
            return 1;
        
        return x * factorialFunction(x-1);
    }

}
