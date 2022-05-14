package assignment5;

import assignment3.Product;

 public class CloneableProd {
 public static void main(String[] args) throws CloneNotSupportedException {

 Product p1 = new Product("Redmi", 12000);
 System.out.println(p1); //original

 //Problem with copying reference
 Product p2 = p1;
 System.out.println(p2); //Is p2 really replica of p1 ?

 p2.setName("Realme"); //when p2 is changing. . .
 System.out.println(p1); // p1(original)also changes. This is the problem
 // here p1 being original should not change
 System.out.println(p2);

 p1.setName("Redmi");
 Product p2Clone= (Product) p1.clone(); //down-casting
 System.out.println("Before cloning, p2Clone = " +p2Clone); //replica of p1

 p2Clone.setName("Realme"); // replica changed, but
 System.out.println(p1); // p1(original)is NOT changing.
 System.out.println("After cloning, p2Clone = " +p2Clone);
 }
 }