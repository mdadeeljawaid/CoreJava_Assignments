package assignment5;

import java.util.Arrays;

import assignment3.Product;

public class ComparableProd {

	public static void main(String[] args) {
		
		Product[] prodArray = new Product[4];
		
		prodArray[0] = new Product("Micromax", 18000);
		prodArray[1] = new Product("Karbonn", 16000);
		prodArray[2] = new Product("Nokia", 19000);
		prodArray[3] = new Product("Lava", 15000);
		
		System.out.println("Products unsorted :");
		
		//display all products using enhanced for loop (also known as for-each loop)
		for(Product p : prodArray)
			System.out.println(p);
		
		
		
		//sort Product objects on the basis of price
		Arrays.sort(prodArray);
		System.out.println("\nProducts sorted on the basis of price :");
		//display all products using enhanced for loop (also known as for-each loop)
		for(Product p : prodArray)
			//System.out.println(p);
			p.display();
		
		
		/*
		//sort product on the basis of name
		Arrays.sort(prodArray);
		System.out.println("\nProducts sorted on the basis of name :");
		//display all products using for-each loop
		for(Product p : prodArray)
			//System.out.println(p);
			p.display();
		*/	
	}

}
