/*
 * 
 * 
 * 
 * This program is about setup and monthly costs for 3 types of phones
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EventKiosk {
    
    public static void main (String[] args){
        
        ArrayList<Phone> newCustomers = new ArrayList<>();
        Scanner keyboardInput = new Scanner( System.in );
        
        boolean memberCA;
        String newPhone;
        String newCarrier;
        
        
        
        System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  " );
        while ( keyboardInput.nextLine().equalsIgnoreCase("y") ) {

            System.out.println("Is the customer a CA member? (Y/N):  ");
            memberCA = ( keyboardInput.nextLine().equalsIgnoreCase("y") );
            
            System.out.println("What type of phone (iPhone, Android or MotoPhone):  ");
            newPhone = keyboardInput.nextLine();
            
            System.out.println("What carrier? (Verizon, AT&T, or T-Mobile):  ");
            newCarrier = keyboardInput.nextLine();
            
            switch ( newPhone ) {
                case "iPhone": {
                	Phone nextPhone = new IPhone(newCarrier);
                	nextPhone.initialize(newCarrier, memberCA);
                    newCustomers.add( nextPhone  );
                    break;
                }// end of case iPhone
                case "Android": {
                	Phone nextPhone = new Android(newCarrier);
                	nextPhone.initialize(newCarrier, memberCA);
                    newCustomers.add( nextPhone  );
                    break;
                }// end of Android
                
                case "MotoPhone": {
                	Phone nextPhone = new MotoPhone(newCarrier);
                	nextPhone.initialize(newCarrier, memberCA);
                    newCustomers.add( nextPhone  );
                    break;
                }// end of MotoPhone
                default: {
                    System.out.println("Unrecognized phone.  Try Again.");
                    break;
                }// end of default case
            }// end of switch statement
                    
            System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  " );
        }// end of while loop
        
        
        
        printReport( newCustomers );
        keyboardInput.close();
    }// end of main method
    
    public static void printReport( ArrayList<Phone> newCustomers ) {

        System.out.printf("%s%n%s%n%s%n%n",
            "==========================================================",
            "=       Columbia 50th Annversary Phone Signup Drive      =",
            "==========================================================" );

        System.out.println("New Customers:\n");
        
        for ( Phone phone : newCustomers ) {
            System.out.printf("%s%n", phone.toString() );
        }// end of for loop 

    }//end of static method
    
}// end of class EventKiosk
