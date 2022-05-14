package fundamentals;

import java.util.Date;

public class Product {
	public static void main(String[] args) {
		//instantiate Product class
		Product product = new Product("Laptop");
		System.out.println(product);
	}
	
	//parameterized constructor
	public Product(int productCode, String productName,Date productInwardDate, float price) {
		//this.productCode
		this.productInwardDate=productInwardDate; // productInwardDate initialization
		this.productName=productName;
		this.price=price;
	}
	
	Product(){
		productCode=nextCode;
	}
	
	//1
	public Product(Date productInwardDate) {
		this();
		this.productInwardDate=productInwardDate; // productInwardDate initialization
	}
	
	//2
	public Product(float price) {
		this(new Date());					//call to another constructor
		this.price=price;					// price initialization
	}
	
	//3
	public Product(String productName) {
		this(35000.00f);					//call to another constructor
		this.productName=productName;		// name initialization
	}
	
	{
		nextCode++;
	}
	
	static{
		nextCode=1001;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productInwardDate="
				+ productInwardDate + ", price=" + price + "]";
	}
	
	//class fields
	int productCode;
	String productName;
	Date productInwardDate;
	float price;
	static int nextCode;
}