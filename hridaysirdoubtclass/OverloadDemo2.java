package hridaysirdoubtclass;

public class OverloadDemo2 {
		
		//Method Overloading
		//On the basis of arguments
		//Types of arguments
		//Type and sequence of arguments
		
		//Requirement to add below input  with methods(functions)
		//20,20 => add(double,int)
		//20,20 => add(int,double)
		
						   //20	     20
		public double add(double x, int y) {
			return x+y;
		}
						   //20	    20
		public double add(int x, double y) {
			return x+y;
		}
		
		
		public static void main(String[] args) {
			
			OverloadDemo2 obj=new OverloadDemo2();
			double res=obj.add(20.5,20);
			
		}

	}