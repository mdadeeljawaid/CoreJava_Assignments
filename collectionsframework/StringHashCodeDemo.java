package collectionsframework;

public class StringHashCodeDemo {
	//In Object class hashCode() implementation is based on address of a newly created object
	
		//In String class hashCode() method is overridden and actual hashcode is calculated based on 
		// object state (object content)
		
		//StringBuffer does not override hashCode(), therefore, hashCode() method returns different integer 
		// since it is decided based on address of the object, even though the contents bare same
		
		// therefore it is necessary to override hashCode() method in our classes, since we can not rely on
		//default implementation of hashCode in Object class
		
		public static void main(String[] args) {
			//create string objects
			//s1, s2, s3 all will be having same hash code value
			//for example as shown in comment below
			String s1 = "Good";
			System.out.println(s1.hashCode());
			
			String s2 = "Good";
			System.out.println(s2.hashCode());
			
			String s3 = new String("Good");
			System.out.println(s3.hashCode());
			
			//StringBuffer: sb1 and sb2 will have same hash code value
			StringBuffer sb1 = new StringBuffer("Good");
			System.out.println(sb1.hashCode());

			StringBuffer sb2 = new StringBuffer("Good");
			System.out.println(sb2.hashCode());
		}

}
