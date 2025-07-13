package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my calculator!\n");
        CoreFeatures cfcalc = new CoreFeatures();
        Double userinput;
        Integer option=-1;


        while(option!=19){
            userinput = Console.getDoubleInput("Enter a number: ");
            cfcalc.setDisplay(userinput);
            showOption();
            option = Console.getIntegerInput("choose one of the options above: ");
            runOption(option, cfcalc, userinput);

        }


    }

    public static void showOption(){
        System.out.println("0. clear display");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. division");
        System.out.println("5. square");
        System.out.println("6. square root");
        System.out.println("7. inverse");
        System.out.println("8. switch sign");
        System.out.println("9. sine");
        System.out.println("10. cosine");
        System.out.println("11. tangent");
        System.out.println("12. inverse sine");
        System.out.println("13. inverse cosine");
        System.out.println("14. inverse tangent");
        System.out.println("15. factorial");
        System.out.println("16. switch display mode");
        System.out.println("17. switch units mode");
        System.out.println("18. memory functions");
        System.out.println("19. exit");
    }

    public static void runOption(Integer option, CoreFeatures cfcalc, Double num){

        Double userinput;

        switch (option) {
            case 0:
                
                break;
            case 1:
                userinput = Console.getDoubleInput("Enter a number to add to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.add(userinput);
                System.out.println("="+cfcalc.getDisplayValue());
                break;
            case 2:
                userinput = Console.getDoubleInput("Enter a number to subtract to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.subtract(userinput);
                System.out.println("="+cfcalc.getDisplayValue());
                break;
            case 3:
                userinput = Console.getDoubleInput("Enter a number to multiply to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.multiply(userinput);
                System.out.println("="+cfcalc.getDisplayValue());
                break;
            case 4:
                userinput = Console.getDoubleInput("Enter a number to divide to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.divide(userinput);
                System.out.println("="+cfcalc.getDisplayValue());
                break;
            case 5:
                userinput = Console.getDoubleInput("Enter a number to square to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.square(userinput);
                System.out.println("="+cfcalc.getDisplayValue()+" : ");
                break;
            case 6:
                userinput = Console.getDoubleInput("Enter a number to square root to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.squareroot(userinput);
                System.out.println("="+cfcalc.getDisplayValue()+" : ");
                break;
            case 7:
                userinput = Console.getDoubleInput("Enter a number to inverse to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.inverse(userinput);
                System.out.println("="+cfcalc.getDisplayValue()+" : ");
                break;
            case 8:
                userinput = Console.getDoubleInput("Enter a number to switch sign to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.switch sign(userinput);
                System.out.println("="+cfcalc.getDisplayValue()+" : ");
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            case 11:
                
                break;
            case 12:
                
                break;
            case 13:
                
                break;
            case 14:
                
                break;
            case 15:
                
                break;
            case 16:
                
                break;
            case 17:
                
                break;
            case 18:
                
                break;
            case 19:
                
                break;
                
            default:

                break;
        }
    }
}
