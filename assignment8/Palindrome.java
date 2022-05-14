package assignment8;
/*
 * Ques5. WAP to find whether a user input string is a palindrome or not.
 */
import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
    	
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string you want to check:");
        str = sc.nextLine();
        
        int n = str.length();
        
        for(int i = n - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        
        if(str.equals(rev))
        {
            System.out.println("This string is palindrome.");
        }
        else
        {
            System.out.println("This string is not palindrome.");
        }
    }
}