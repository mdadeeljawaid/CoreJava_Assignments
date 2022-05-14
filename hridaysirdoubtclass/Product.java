package hridaysirdoubtclass;

public class Product {

	int pId;
	String pName;
	String pBrand;
	float pPrice;

	public Product(int pId,String pName,String pBrand,float pPrice) {
		this.pId=pId;
		this.pName=pName;
		this.pBrand=pBrand;
		this.pPrice=pPrice;
		System.out.println("Product Details saved");
	}

	public String toString() {
		return pId+"\t"+pName+"\t"+pBrand+"\t"+pPrice;
	}
}
