package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my calculator!\n");

        Double userinput;
        Integer option=-1;


        while(option!=19){
            userinput = Console.getDoubleInput("Enter a number: ");
            showOption();
            option = Console.getIntegerInput("choose one of the options above: ");
            runOption(option);

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

    public static void runOption(Integer option){
        switch (option) {
            case 0:
                
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
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
