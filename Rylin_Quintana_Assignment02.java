
/**
 * Basic program that takes user input and calculates a net annual pay.  Program will then display results along with messages explaining the calculations
 *
 * @author Rylin Quintana
 * @version 1.0
 */
import java.util.Scanner;//mport Scanner
import javax.swing.JOptionPane; //Import Dialog Box

public class Rylin_Quintana_Assignment02
{
    public static void main(String[] args)
    {
        //Create variables
        String placeholder;
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;
        //Create a new scanner for user input
        Scanner stdIn = new Scanner(System.in);
        
        //Welcome user and prompt for first name and take input
        System.out.println("Welcome to the annual net pay calculator!");
        firstName = JOptionPane.showInputDialog("Please enter your first name here:");
        //Prompt for middle initial and take input
        placeholder = JOptionPane.showInputDialog("Please enter your middle initial here:");
        //parse for first character 
        middleInitial = placeholder.charAt(0);
        //Prompt for last name and take input
        lastName = JOptionPane.showInputDialog("Please enter your last name here:");
        //Prompt for age and take input
        placeholder = JOptionPane.showInputDialog("Please enter your age here:");
        //parse string to int
        age = Integer.parseInt(placeholder);
        //Prompt for gross annual pay and take input
        placeholder = JOptionPane.showInputDialog("Please enter your gross annual pay here:");
        //parse string to double 
        grossAnnualPay = Double.parseDouble(placeholder);
        //Prompt for tax rate as a decimal and take input
        placeholder = JOptionPane.showInputDialog("Please enter your tax rate as a decimal here:");
        //parse string to double 
        taxRate = Double.parseDouble(placeholder);
        //Caclculate net pay
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
        
        //Display the results in an orderly, readable manner
        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName +"!");
        System.out.println("You are currently " + age);
        System.out.println("Congrats! You made " + grossAnnualPay + " and the goverment is stealing from you at a rate of " + taxRate);
        System.out.println("After the government takes your money, you will be left with " + netAnnualPay);
        
        System.exit(0);
        stdIn.close();
    }
}
