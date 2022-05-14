package fundamentals;

class StringPoolDemo {

	public static void main(String[] args) {
		//CASE I : Creating new String that is present in string pool
		String s1="Good";				//in pool
		String s2= new String("Good");	// will not be created in pool
		String s2new = s2.intern();		// the ref. of string having same content in pool is returned
		
		//check the result of invoking intern() method in CASE I
		if( s1 == s2new)
			System.out.println("s1 and s2 now are referring to a same String objects");
		else
			System.out.println("s1 and s2 now are referring to two different String objects");
		
		//CASE II : Creating new String  that is different than present in string pool
		String s3= new String("Better");	// the String Better is not in pool
		String s3new = s3.intern();		
		
		//check the result of invoking intern() method in CASE II
		if( s1 == s3new)
			System.out.println("s1 and s3 now are referring to a same String objects");
		else
			System.out.println("s1 and s3 now are referring to two different String objects");
	}

}
