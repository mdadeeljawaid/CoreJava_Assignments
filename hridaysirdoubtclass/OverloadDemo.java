package hridaysirdoubtclass;

public class OverloadDemo {
	
	//Method Overloading
	//On the basis of arguments
	//Types of arguments
	//Type and sequence of arguments
	
	//Requirement to add below input  with methods(functions)
	//20,30 => add(int,int)
	//20,30,40 => add(int,int,int)
	//20.4,25.5 => add(double,double)
	//20.4,15 => add(int,double)
	//15.50f,15,27.5 => add(float,int,double)
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public void add(double x, double y) {
		System.out.println("Double sum is : "+(x+y));
	}
	
	public double add(double x, int y) {
		return x+y;
	}
	
	public double add(int x, double y) {
		return x+y;
	}
	
	public static double add(float x, int y, double z) {
		return x+y+z;
	}
		
	public static void main(String[] args) {
		OverloadDemo obj=new OverloadDemo();
		int result=obj.add(30,60); //call-1, 90, non-static method call
		System.out.println("Two integer sum is: "+result);
		obj.add(50.5, 20.3); //call-2
		System.out.println("double int sum is: "+obj.add(40.5, 30)); //call-3
		
		result=obj.add(result, result,90); //call-4
		System.out.println("Three int sum is: "+result); //270
		
		OverloadDemo.add(30.5f,  30,  40.4); //static method call

	}

}
