package hridaysirdoubtclass;

import java.util.ArrayList;
import java.util.Scanner;

import fundamentals.Product;

public class ProductManager {

	static void addProductToList(ArrayList<Product> list) {
		int pid;
		String name;
		String brand;
		float price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Id:");
		pid=sc.nextInt();

		boolean idFound=searchProductById(list,pid);
		while(idFound) {
			System.out.println("Product Id already exists. Enter product id again");
			pid=sc.nextInt();
			idFound=searchProductById(list,pid);
		}

		System.out.println("Enter Product Name:");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Product Brand:");
		brand=sc.nextLine();
		System.out.println("Enter Product Price:");
		price=sc.nextFloat();
		list.add(new Product(pid,name,brand,price));
	}

	static void displaytAllProductList(ArrayList<Product> list) {
		if(list.isEmpty()) {
			System.out.println("Product list is empty");
			return;
		}
		System.out.println("Product List:");
		System.out.println("PID\tName\tBrand\tPrice");
		for(Product p:list) {
			System.out.println(p);
		}
	}

	static boolean searchProductById(ArrayList<Product> list,int searchId) {
		if(list.isEmpty()) {
			System.out.println("Product list is empty");
			return false;
		}
		for(Product p:list) {
			if(p.pId==searchId) {
				System.out.println(p);
				return true;
			}
		}
		return false;
	}

	static void sortProductList(ArrayList<Product> list,int choice) {
		if(list.isEmpty()) {
			System.out.println("Product list is empty");
			return;
		}
		list.sort(new IdComparator());
	}
	public static void main(String[] args) {



	}

}
