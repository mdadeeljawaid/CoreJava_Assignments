package assignment4;

public class ShapeImplement {

	public static void main(String[] args) {
	
		Rectangle r = new Rectangle(10.00f,5.00f);
		r.calculateArea();
		r.calculatePerimeter();
		r.display();
		
		System.out.println();
		
		Circle c = new Circle(5);
		c.calculateArea();
		c.calculatePerimeter();
		c.display();
		
		System.out.println();
		
		Cuboid cu = new Cuboid(10, 20, 10);
		cu.calculateSurfaceArea();
		cu.calculateVolume();
		cu.display();
		
		System.out.println();
		
		Sphere s = new Sphere(10);
		s.calculateSurfaceArea();
		s.calculateVolume();
		s.display();
		

	}

}