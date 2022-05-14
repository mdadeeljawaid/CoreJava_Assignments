package hridaysirdoubtclass;

import java.util.Scanner;

//import fundamentals.HelloWorld;

class Calculator{
	
	public Calculator() {
		
	}
	//define 4 method to add subtract multiply and divide
	//method with return value and with parameter
	public int add(int num1,int num2) {		
		//some logic
		int res=num1+num2;
		return res;
	}
	//method without return value and with parameter
	//static method
	                            //here num1 and num2 are formal argument
	public static void subtract(int num1,int num2) {	
		
		int res=num1-num2;
		System.out.println("Difference is:"+res);
	}
	//method with return value and without parameter
	public int multiply() {		
		int num1=20;
		int num2=30;		
		return num1*num2;
	}
	//method without return value and without parameter
	public void divide() {		
		int num1=200;
		int num2=30;
		System.out.println("Quotient is:"+(num1/num2));
	}	
	//true/false
	                   //here number is formal argument
	public boolean checkPrime(int number) {
		
		  //number 23
		// boolean flag=true;		 
		 for(int i=2;i<=number/2;i++) {
	    	 
	    	      if(number%i==0) {
	    	    	 // flag=false;
	    	    	 // break;
	    	    	  return false;
	    	      }
	     }//end of loop body
	     
	     return true;		
	}	
}


public class TestApplication {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();//object creation
		int result=calc.add(30,60);//method calling,in c function calling
		System.out.println("sum is:"+result);
		//calc.subtract(50,20);
		             //here 30,10 are actual argument
		Calculator.subtract(30, 10);//calling of a static method
		//Calculator.add(40,50);
		//calc.multiply();
		System.out.println("multiplication is:"+calc.multiply());
		calc.divide();//calling of a non-static method of any class
		
      //to check checkPrime
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check for prime:");
		num=sc.nextInt();
		
		//boolean res=calc.checkPrime(num);
		
		//here num is actual argument
		if(calc.checkPrime(num)) {
			
			System.out.println(num +" is a prime");			
		}
		else
			System.out.println(num +" is not a prime");		
		//int[][]arr=new int[5][];
		//Math.
		
	}

}
