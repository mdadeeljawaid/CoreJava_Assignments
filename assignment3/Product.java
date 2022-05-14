
/*  ASSIGNMENT - 3 (Done by Md Adeel Jawaid)
Q1:
A) Write a Java class for the entity known as Product with following class fields:
productId
productName
productPrice
Complete the class by adding constructors, accessors, mutators and a behavioural method display()
B) Also, add the main() method in same class to test the class by creating its objects

Q2:
A) Also add code to automate the generation of productId with the help of initialization blocks
B) Add the factory method with name as getAccessoryProduct() to return the object of Product class

Q3:
A) Create an array of 4 products and populate it with objects of products by adding an accept() method
B) Add the method displayAllProducts() by passing array as a parameter i.e. public void displayAllEmploees(Product[ ] products)
*/
package assignment3;

public class Product implements Comparable<Product>, Cloneable {
	

	public Product() {			//default constructor
		
			productId=00;
			productName="NA";	 
			productPrice=0.0f;
			
		}
	
	
	public Product(int productId, String productName, float productPrice){		//parameterised constructor
		
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	public Product(int productId) {   // constructor
		this.productId=productId;
	}
	
	public Product(String productName) {   // constructor
		this.productName=productName;
	}
	
	public Product(float productPrice) {   // constructor
		this.productPrice=productPrice;
	}
	
	public Product(String productName, float productPrice) {	//parameterised constructor
		this.productId=nextId;
		this.productName=productName;
		this.productPrice=productPrice;	
	}
	public int getProductId() {			//accessor method
		return productId;
	}
	public String getProductName() {		//accessor method
		return productName;
	}
	public void setName(String productName) {
	 this.productName=productName;
	 }
	
	public float getProductPrice() {		//accessor method
		return productPrice;
	}
	public void setProductPrice(float productPrice) {	//mutator
		this.productPrice=productPrice;
	}
	public void display() {		//behaviourial method
		System.out.println(productId+" "+productName+" "+productPrice);	
	}
	//factory method : returns the object of the class
	public static Product getAccessoryProduct(String productName, float productPrice) {
		Product temp = new Product(productName, productPrice);
		return temp;
	}
	
	//override toString() method
	public String toString(){
	return productId + " " + productName + " " +productPrice;
	}
	
	//override compareTo() method of Comparable interface to order Product objects
	 //for ordering product on the basis of price
	  @Override
	 public int compareTo(Product p) {
	 if( productPrice < p.productPrice ) return -1; //productPrice of invoking object is
	 												//less than passed object
	 
	 else if( productPrice > p.productPrice ) return 1; //productPrice of invoking object is
	 													//greater than passed object
	
	 return 0; //salary of invoking object & passed object is equal
	 }
	 
	  
	 //for ordering product on the basis of name
	/* public int compareTo(Product p) {
	 return productName.compareTo(p.productName); //invoke compareTo() of String class
	 //The String class compareTo() method lexicographically compare this
	 //string with passed parameter string
	 }
	*/
	 //override clone()
	 public Object clone() throws CloneNotSupportedException {
	 Object temp=null;
	
	 temp = (Product) super.clone();
	 return temp;
	 }
	
	//initialisation blocks
	static {				//static initialization blocks
		nextId=1000;
	}
	
	{						//instance initialization blocks
		nextId++;
	}
	
	//class field
	private int productId;
	String productName;					//package-private
	private float productPrice;
	
	private static int nextId;			//static class field
										//field initialization
	//static class field is shared by all the objects of the class

	public void accept(String productName) {  //accept() method
		this.productName=productName;
		
	}
	
	public void displayAllProducts(Product[] products) {
		System.out.print("Name of the Product is : "+productName);      //displayAllProducts() method
		System.out.println();
	}

public static void main(String[] args) {
	
			Product obj = new Product();			//creates an object
			
			Product[] obj1 = new Product[4];		//array of 4 products
			obj1[0] = new Product("Samsung_TV");
			obj1[1] = new Product("LG_TV");
			obj1[2] = new Product("Panasonic_TV");
			obj1[3] = new Product("Mi_TV");
			
			obj.display();					//method to display objects of products
			
			obj1[0].displayAllProducts(obj1);
			obj1[1].displayAllProducts(obj1);
			obj1[2].displayAllProducts(obj1);
			obj1[3].displayAllProducts(obj1);
	
	//instantiate Product class
	Product product = new Product();
	product.display();
	
	product = new Product(101, "Samsung_TV", 45000.00f );
	product.display();
	
	System.out.println("Price of " + product.getProductName() + " of Product Id " + product.getProductId() + " is Rs. "+ product.getProductPrice());
	
	}	
}