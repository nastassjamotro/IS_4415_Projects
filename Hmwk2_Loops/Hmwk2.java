//Write a program that asks the user to enter their full name, credit card number and credit card charge amount.

import java.util.Scanner;

public class Hmwk2 {
  public static boolean isThisCreditCardValid(String ccNumber) {
    int sum = 0;
    boolean alternate = false;
    for (int i = ccNumber.lenght() - 1; i >= 0; i--) {
      int n = Integer.parseInt(ccNumber.substring(i, i + 1));
      if (alternate) {
        n *= 2;
        if (n > 9) {
          n = (n % 10) + 1;
        } // end of second if statement
      } // end of first if statement
      sum += n;
      alternate = !alternate;
    } // end of for clause
    return (sum % 10 == 0);
  } // end of card validation method
  
  public static void main(String args[]) {
    // store card holder name
    final String holderName = "Robert Bruce";
    
    // make credit card amount a max of $1,000.00
    final float cardMax = 1000.00f;
    
    // setting variables
    Scanner input = new Scanner(System.in);
    String fullName;
    String cardNumber;
    float amount;
    boolean again = true;
    
    // first validate the card holder's name
    do {
      System.out.print("What is the credit card holder's full name?");
      fullName = input.nextLine();
      if (fullName.equals(holderName)) {
        again = false;
      } else {
        System.out.println("Account holder name you have entered is invalid. Try again");
      } // end of if-else statement
    } while (again); // end of card holder name do loop
    
    //validate credit card number
    do {
      System.out.print("What is the credit card number?");
      cardNumber = input.nextLine();
      if (isThisCreditCardValid(cardNumber)) {
        again = false;
      } else {
        System.out.println("Card number you have entered is invalid. Try again");
        input.nextLine();
      } // end of if-else statement
    } while (again); // end of cc# do loop
    
    // validate amount charged
    do {
      System.out.print("How much should be charged on the credit card?");
        amount = input.nextFloat();
        if (amount <= cardMax && 0 < amount) {
          again = false;
        } else {
          System.out.println("Amount entered exceeds allowance. Try again");
          amount = input.nextFloat();
        } // end of if-else statement
    } while (again); // end of amount do loop
    
    System.out.printf("You have successfully processed the payment in the amount of $%7.2f", amount);
  } // end of main
} // end of class













