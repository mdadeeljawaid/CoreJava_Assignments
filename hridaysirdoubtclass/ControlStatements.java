package hridaysirdoubtclass;

import java.util.Scanner;

/*
 * 1-input array values
 * 2-display
 * 3-find max from array
 * 4-find min from array
 * 5-exit 
 * */
public class ControlStatements {
	
   static  void inputValues(int []arr,int size) { 	   
	   System.out.println("\nEnter array values:");
	   Scanner sc=new Scanner(System.in);
       for(int i=0;i<size;i++) {
    	   System.out.println("Enter array value "+(i+1)+": ");
    	   arr[i]=sc.nextInt();
       }  
   }
   static  void displayArrayValues(int []arr,int size) { 
    	   
    	   System.out.println("\nArray values are:");    	   
           for(int i=0;i<size;i++) {
        	 System.out.print(arr[i]+"\t");
           }
	   
   }
   //arr={4,10,7,26,6}
   //26
   /* max=arr[0] assume
    * n-1 values will be compared with max
    * if any position value is greater than max ,swap it 
    * */
   static  int  getMaxArrayValue(int []arr,int size) { 
	   
	   int max=arr[0];  	   
       for(int i=1;i<size;i++) {    	   
    	   if(max<arr[i]) {
    		   max=arr[i];//26
    	   }    	
       }
       return max;   
}	

	public static void main(String[] args) {
		
		int [] arr=new int[5] ;	
		int choice;
		do {
			    System.out.println("\n*******Array Operation*******");
			    System.out.println("1:for input array values");
			    System.out.println("2:for Display");
			    System.out.println("3:for Get Max from Array");
			    System.out.println("4:for  Get Min from Array");
			    System.out.println("5:for Exit");
			    System.out.println("\nEnter your choice value [1-5]:");
				Scanner sc=new Scanner(System.in);
				do {		
				    choice=sc.nextInt();
				    if(choice<1||choice>5)
				    	System.out.println("\nWrong input,input choice value again:");
				}while(choice<1||choice>5);
			    
			    switch(choice) {
			    case 1:
			    	ControlStatements.inputValues(arr, 5);
			    	break;
			    case 2:
			    	ControlStatements.displayArrayValues(arr, 5);
			        break;
			    case 3:
			        System.out.println("max from array:"
			                       +ControlStatements.getMaxArrayValue(arr, 5));
			        break;
			     //default:
			    	// System.out.println("Invalid choice");
			    }			
		
		}while(choice!=5);
		System.out.println("end of main");
	}

}