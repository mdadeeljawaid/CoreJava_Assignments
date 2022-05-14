package fundamentals;

public class Loop {

	public static void main(String[] args) {
		
		int x;
		
		x=0; //initialization
		while(x < 10) { //condition
		//System.out.println("x="+ x); // type syso and press key combination ctrl+space
		System.out.print("Welcome ");
		x++; //modification x=x+1;
		// x++; post-increment
		// ++x; pre-increment
		// x+=1; add and assign
		}
		System.out.println();
		
		x=0;
		do{ //condition
		System.out.print(" x="+x); //display x //task
		x++; //modification
		}while( x < 10 );
		
		System.out.println();
		
		//for loop
		for(x=0; x<10; x++)
		System.out.print(" x="+x); //task

	}

}
