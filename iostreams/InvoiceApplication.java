package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class LineItem implements Serializable {
	//default constructor
	public LineItem(){
		
	}
	
	//parameterized constructor
	public LineItem(String itemName, float price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void calculateAmount() {
		amount = price*quantity;
	}
	
	
	@Override
	public String toString() {
		return "LineItem [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", amount=" + amount
				+ "]";
	}

	//class fields
	String itemName;
	float price;
	int quantity;
	transient  float amount;
}


public class InvoiceApplication{
	public static void main(String[] args) {
		//LineItem item  = new LineItem("Laptop", 36000.00f, 2);
		LineItem item  = new LineItem("HDD", 6000.00f, 5);
		item.calculateAmount();
		System.out.println(item);
		
		try {
			//create ObjectOutputStream
			ObjectOutputStream ostream 
			= new ObjectOutputStream(new FileOutputStream("E:\\samplefiles\\lineitems.dat"));
			
			//write the object
			ostream.writeObject(item);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			//create ObjectInputStream
			ObjectInputStream istream 
			= new ObjectInputStream(new FileInputStream("E:\\samplefiles\\lineitems.dat"));
			
			//read the object
			LineItem itemRead = (LineItem)istream.readObject();
			
			System.out.println("Item read by ObjectInputStream from the file: ");
			System.out.println(itemRead);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}