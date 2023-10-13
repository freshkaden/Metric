import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args){
        
        // initialize and declare integer var choice
        int choice = 0;
        
        // collect user input
        Scanner scanner = new Scanner(System.in);
        
        while (choice != -1){

        // present menu of choices for different conversions
        System.out.println("---------------------");
        System.out.println("What conversion would you like?");
        System.out.println("1: kg to lbs");
        System.out.println("2: kilometers to miles");
        System.out.println("3: Celsius to Fahrenheit");
        System.out.println("4: Milimeters to Inches");
        System.out.println("-1: quit program");
        System.out.println("---------------------");

        System.out.println("Enter Choice:");
        //collect user input for choice of conversion and store it in integer variable choice
        try {
        choice = scanner.nextInt();
/* 
        while ((choice != -1) || (choice != 1) || (choice != 2) || (choice != 3) || (choice != 4)) {
            System.out.println("Invalid Choice! Input again: ");
            choice = scanner.nextInt();
        }
    */
        try {
        //while (choice != -1){
            switch (choice){
                
                // quit option
                case -1:
                System.out.println("quitting program. bye bye!");
                break;
                
                
                
                // converting kg to lbs
                case 1:
                float kg;
                float lbs;
                System.out.print("Enter kg: ");
                kg = scanner.nextFloat();
                
                // kg to lbs conversion
                lbs = (float) (kg * 2.2046);
                
                // output the value of lbs after kg has been converted
                System.out.println("Converted to LBS = " + lbs + " lbs");
                break;
                
                // converting km to miles
                case 2:
                float km;
                float miles;

                // collects input and stores in var km
                System.out.print("Enter Kilometers: ");
                km = scanner.nextFloat();

                // km to miles conversion
                miles = (float) (km * 0.62137);

                //output miles
                System.out.println("Converted to Miles = " + miles + " miles");
                
                break;
                
                // converting celsius to fahrenheit
                case 3:

                float cel;
                float fah;

                //collects input for celsius
                System.out.print("Enter Celsius value in float number: ");
                cel = scanner.nextFloat();
                
                // celsius to fahreneheit conversion
                fah = (float) (( cel *1.8) + 32.0);

                //output the fahrenheit value to user
                System.out.println("Fahrenheit: " + fah);


                break;
                
                // converting milimeters to inches
                case 4:

                float mm;
                float in;

                // collectes user input of millimeter value using scanner
                System.out.print("Enter millimeters: ");
                mm = scanner.nextFloat();

                in = (float) ((mm * 0.03937));

                // output the inches to user after conversion
                System.out.println("Converted to inches = " + in + " inches");

                break;


                // if user does not enter any of the options from menu
                default:
                System.out.println("INVALID Option. Choose again.");
                break;
            }

        }
           catch (java.util.InputMismatchException e){
            System.out.println("Error! Please enter a valid number");
            scanner.next();
           }
        }
            catch (java.util.InputMismatchException e) {
                System.out.println("Error! Pick a valid option.");
                scanner.next();
            }
    }

        scanner.close();
    }
}
