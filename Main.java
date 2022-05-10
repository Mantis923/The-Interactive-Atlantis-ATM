/********************************************
*	AUTHORS:	GIULIO VITTI
* COLLABORATORS: ADAM L, SAMUEL P
*	LAST MODIFIED:	APRIL 23, 2022
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
* THE INTERACTIVE ATLANTIS ATM
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*	<ex: Scanner= used for console input>
*********************************************/

//Maybe Adam does UML above
// <IMPORTS GO HERE>

public class Main {
  
  /***** CONSTANT SECTION *****/
   
  public static void main(String[] args)
  {
    char decision = 'Y';
   
    /***** INITIALIZATION SECTION *****/
    
    do {
      
     //Giulio did lines 41-55
      
      System.out.println("Welcome to Atlantis International Bank!\n");
    System.out.println("Pick an option from the menu below to continue:\n");
    System.out.println("1. Deposit cash\n");
    System.out.println("2. Withdraw cash\n");
    System.out.println("3. Check your balance\n");
    System.out.println("4. Convert currency\n");
    System.out.println("5. See the daily exchange rates\n");
    int option = UtilityBelt.readInt("Option: ", 1, 5);
      System.out.println();
    Main.displayResults(option);
      decision = UtilityBelt.readChar("Would you like to continue (y/n)? ", "YyNn");
      System.out.println();
    } while (decision == 'Y' || decision == 'y');
    
    System.out.println("Have a great rest of you day!");
    
    }

     /***** STATIC METHODS *****/
  //Giulio Vitti did cases 1-3 
  //Samuel P did cases 4-5 and the array for 5
  
  public static void displayResults (int selection) {
    switch (selection) {
       case 1: 
         double dollar = UtilityBelt.readDouble("\n How much money would you like to deposit? \n\n $", 1,1000000.00);
         double newBalance = dollar += 1000000.00;
         System.out.println("\nYou now have $" + newBalance + " in your bank account! \n"); 
         break;
       case 2: 
         double deduct = UtilityBelt.readDouble("\n How much money would you like to withdraw? \n\n $", 1, 1000000);
         double newBalance1 = 1000000.00 - deduct;
         System.out.println("\nYou now have $" + newBalance1 + " in your bank account! \n");
         break;
       case 3: 
         System.out.println("\nYour balance is $1,000,000.00 \n");
         break;
       case 4: 
         System.out.println("Which currency would you like to convert to?\n");
        System.out.println("1. Dollar to pesos\n");
        System.out.println("2. Dollar to euros\n");
        System.out.println("3. Dollar to yen\n");
        System.out.println("4. Dollar to pounds\n");
        System.out.println("5. Dollar to kroner\n");
        int option1 = UtilityBelt.readInt("Option: ", 1, 5);
        System.out.println();
        Main.convertCurrency(option1);
      case 5:
        System.out.println("\nHere are the following exchange rates: \n");
        Main.showRates();
        break;
      }
   }
  
  //Sam P did the convertCurrency ()
  
  public static void convertCurrency (int selection) {
    double usDollar = UtilityBelt.readDouble("How much money would you like to convert?\n $", 1, 100000000.00);
    switch(selection) {
              
        case 1: 
          double peso = Double.valueOf(usDollar * 20.40).longValue();
          System.out.printf("You have ₱%.2f pesos\n",peso);
             break;
        case 2: 
          double euro = usDollar * 0.95;
          System.out.printf("You have €%.2f\t",euro );
	             break;
        case 3: 
          double yen = Double.valueOf(usDollar * 129.82).longValue();
	          System.out.printf("You have ¥%.2f\t",yen);
	             break;
        case 4: 
          double pound = usDollar * .79;
	          System.out.printf("You have £%.2f\t",pound);
	             break; 
        case 5: 
          double kroner = Double.valueOf(usDollar * 7.08).longValue();
	          System.out.printf("You have kr%.2f\t", kroner);
	             break;
         }
  
    }

    //Sam P did the showRates ()
  
   public static void showRates()
    {
      double conversions[] = {20.40, 0.95, 129.82, 0.79,7.08};
      String currency[] =  {"peso","euro","yen","pound","kroner"};
      String symbols [] = {"₱", "€", "¥", "£", "kr"};
        for(int i = 0; i < conversions.length; i++) {
            System.out.println("The dollar to " + currency[i] + " rate is " + symbols[i] + conversions[i] + "/dollar\n");
          }
    }
  }

//Sam P did the README.md file

/*
For updating the info for one person without a class, you can go back to L10: TacoStand to see how it was done there and see if it would make sense to implement what you've previously done. It may not work with your loops, but maybe there is some info there you could use. 
*/