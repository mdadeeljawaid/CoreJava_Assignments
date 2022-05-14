package practice;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		System.out.print("Enter the string you want to check:");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		
		int high = str.length()-1;	//variable for backward traversal
		int low = 0;				//variable for forward traversal
		boolean flag = true;			//flag variable to check
		
        while(low<=high) {		//loop for traversal till mid
        	
        	if(str.charAt(low)!=str.charAt(high)) {
        		flag=false;
        		break;
        	}
        	
        	low++;
        	high--;
        }
        if(flag) {
        	System.out.println("This string is palindrome");
        }
        else {
        	System.out.println("This string is not palindrome");
        }
	}

}
