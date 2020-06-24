/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/** Improve the code by applying suitable design principles
 * date: June 24
 * @author Sivagama
 */
public class Account {

    
        public double balance;
        public double interestRate=0.3;
        public String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //To create an account the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=balance+amount;
        }
        
        public void limitFund(double amount){
        Scanner input = new Scanner(System.in);
        if (amount<50){
            while (amount<50){
            System.out.println("Please add an initial amount of 50 or higher");
            amount=input.nextDouble();
            }
        }
        else
            System.out.println("Account Created");
        }
        
        public void newAmount(double bal, double interest){
        
        interest=(bal*interest);
        bal=bal+interest;
        
        System.out.println("Your balance "+ bal);
            
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=balance-amount;

        } 
    
}//class end
