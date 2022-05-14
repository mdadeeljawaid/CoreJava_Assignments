package practice;

public class JavaMethods {
	
	static int mySum(int x, int y) {
		int z;
		
		if(x>y) {
			z=x-y;
		}
		else {
			z=(x+y)*6;
		}
		return z;
	}
	public static void main(String[] args) {
		
		int a = 10;
		int b= 20;
		int c;
		
		c= mySum(a,b);
		
		System.out.println(c);
	}

}
