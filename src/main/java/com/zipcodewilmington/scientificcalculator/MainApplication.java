package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my calculator!\n");
        CoreFeatures cfcalc = new CoreFeatures();
        ScientificCalc sCalc = new ScientificCalc();
        Double userinput;
        Integer option=-1;


        while(option!=19){
            userinput = Console.getDoubleInput("Enter a number: ");
            cfcalc.setDisplay(userinput);
            showOption();
            option = Console.getIntegerInput("choose one of the options above: ");
            runOption(option, cfcalc, sCalc,userinput);

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

    public static String outputConverter(ScientificCalc sCalc, Double x){
        String temp = "";
        int aperiod;
        int bperiod;
        String parts[];

        switch (sCalc.getDisplayMode()) {
            case "decimal":
                temp = String.valueOf(x);
                break;
            case "hexadecimal":
                temp = Double.toHexString(x);
                break;
            case "binary":
                parts = String.valueOf(x).split("\\.") ;
                bperiod = Integer.valueOf(parts[0]);
                aperiod = Integer.valueOf(parts[1]);
                temp = Integer.toBinaryString(bperiod)+"."+Integer.toBinaryString(aperiod);
                break;
            case "octal":
                parts = String.valueOf(x).split("\\.") ;
                bperiod = Integer.valueOf(parts[0]);
                aperiod = Integer.valueOf(parts[1]);
                temp = Integer.toOctalString(bperiod)+"."+Integer.toOctalString(aperiod);
                break;
            default:

                break;
        }


        return temp;
    }

    public static void runOption(Integer option, CoreFeatures cfcalc,ScientificCalc sCalc ,Double num){

        Double userinput;

        switch (option) {
            case 0:
                cfcalc.clear();
                break;
            case 1:
                userinput = Console.getDoubleInput("Enter a number to add to "+cfcalc.getDisplayValue()+" : ");
                cfcalc.add(userinput);
                System.out.println("="+outputConverter(sCalc, cfcalc.getDisplayValue()));
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
                cfcalc.square();
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
                System.out.println("sine("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.sine(cfcalc.getDisplayValue())));
                break;
            case 10:
                System.out.println("cosine("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.cosine(cfcalc.getDisplayValue())));
                break;
            case 11:
                System.out.println("tangent("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.tangent(cfcalc.getDisplayValue())));
                break;
            case 12:
                System.out.println("inverse sine("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.inverseSine(cfcalc.getDisplayValue())));
                break;
            case 13:
                System.out.println("inverse cosine("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.inverseCosine(cfcalc.getDisplayValue())));
                break;
            case 14:
                System.out.println("inverse tangent("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.inverseTangent(cfcalc.getDisplayValue())));
                break;
            case 15:
                System.out.println("factorial("+cfcalc.getDisplayValue()+")= "+outputConverter(sCalc, sCalc.factorial(cfcalc.getDisplayValue())));
                break;
            case 16:
                String temp = "";
                temp = Console.getStringInput("type an option or click enter for auto next (decimal, hexadecimal, binary, octal): ");
                if(temp.isEmpty())
                    sCalc.switchDisplayMode();
                else
                    sCalc.switchDisplayMode(temp);
                
                break;
            case 17:
                String temp2 = "";
                temp2 = Console.getStringInput("type an option or click enter for auto next (radians, degree): ");
                if(temp2.isEmpty())
                    sCalc.switchUnitsMode();
                else
                    sCalc.switchUnitsMode(temp2);
                break;
            case 18:
                int x = Console.getIntegerInput("Memmory options:\n1.Add a number to memmory\n2.Reset memmory\n3.Recall for memmory\nChoose an option: ");
                switch (x) {
                    case 1:
                        userinput = Console.getDoubleInput("Enter an number to add to memory: ");
                        sCalc.memmoryFunctions(x, "m+");
                        break;
                    case 2:
                        sCalc.memmoryFunctions(x, "mc");
                        break;
                    case 3:
                        sCalc.memmoryFunctions(x, "mrc");
                        cfcalc.setDisplay(sCalc.mrc());
                        break;
                    default:
                        break;
                }
                break;              
            default:

                break;
        }
    }
}
