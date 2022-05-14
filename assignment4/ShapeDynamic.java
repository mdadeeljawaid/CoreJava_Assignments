package assignment4;

public class ShapeDynamic {

	public static void main(String[] args) {
		
		Shape[] shape = new Shape[4];
		shape[0] = new Rectangle(10,5);
		shape[1] = new Circle(10);
		shape[2] = new Cuboid(10,10,30);
		shape[3] = new Sphere(15);
		for(int i=0; i<shape.length; i++) {
			 shape[i].calculateArea();
			 shape[i].calculatePerimeter();
			 shape[i].calculateSurfaceArea();
			 shape[i].calculateVolume();
			 
			 shape[i].display2D();
			 shape[i].display3D();
			

			 }
		

	}

}