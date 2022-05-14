package assignment5;

import java.util.*;

interface Product{  //interface declaration
	
	void display();
}

class AcceptProduct implements Product { 		
	
	Scanner sc=new Scanner(System.in);
	private String Mobile, Smart_TV, LED_Bulb;
	
	public void SetProduct()
	{
		System.out.println("********************************");
		System.out.println("Enter the brand of Mobile Phone : ");
		Mobile=sc.nextLine();
		System.out.println("Enter the brand of Smart_TV : ");
		Smart_TV=sc.nextLine();
		System.out.println("Enter the brand of LED_Bulb : ");
		LED_Bulb=sc.nextLine();
		System.out.println("********************************");
		System.out.println();
	}
	
	public void display()
	{
	System.out.println("********************************");
	System.out.println("Name of Mobile : "+Mobile);
	System.out.println("Name of Smart_TV: "+Smart_TV);
	System.out.println("Name of LED_Bulb : "+LED_Bulb);
	System.out.println("********************************");
	System.out.println();
	}
}

class ProductPrice implements Product		
{
	Scanner sc=new Scanner(System.in);
	private int mb,st,lb;
	
	public ProductPrice(int mb,int st,int lb)
	{
	this.mb = mb;
	this.st= st;
	this.lb = lb;
	}
	
	public void UpdatePrice()
	{
	System.out.println("Update Mobile's price: ");
	mb=sc.nextInt();
	System.out.println("Update Smart_TV's price: ");
	st=sc.nextInt();
	System.out.println("Update LED_Bulb's price: ");
	lb=sc.nextInt();
	System.out.println();
	}
	
	public void display()
	{
		System.out.println("The Mobile's price is: " +mb);
		System.out.println("The Smart_TV's price is: " +st);
		System.out.println("The LED_Bulb's price is: " +lb);	
		System.out.println();
	}
	
	
}

public class Quest01 {

	public static void main(String[] args) {
		
		AcceptProduct ap = new AcceptProduct();
		ap.SetProduct();
		ap.display();
		
		ProductPrice pp = new ProductPrice(12000,25000,110);
		System.out.println("********************************");
		System.out.println("Original price");
		pp.display();
		System.out.println("********************************");
		
		pp.UpdatePrice();
		System.out.println("********************************");
		System.out.println("Updated price");
		pp.display();
		System.out.println("********************************");
		
		
	}

}