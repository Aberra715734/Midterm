/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 * date: June 24
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 5 accounts can be created
        for the given bank*/ 
        Account[] ac=new Account[5];
        
        System.out.println("Please enter the amount by which you want to open an account:");
        
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
        
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        
        
        /* modify the code to store 5 accounts in array and print balance and monthly Interest for the available balance */
        
        Account a=new Account(bal,user);
       a.limitFund(bal);
       
        System.out.println("The balance is: "+a.balance);  
        System.out.println("The InterestRate per month is "+a.interestRate);
        a.newAmount(bal,a.interestRate);
    }
}
