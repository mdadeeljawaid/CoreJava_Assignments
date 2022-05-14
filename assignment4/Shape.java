package assignment4;

public abstract class Shape {


	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	public abstract void calculateSurfaceArea();
	public abstract void calculateVolume();
	public void display2D() {
		System.out.println("AREA = "+area+" "+"PERIMETER = "+perimeter);
	}
	public void display3D() {
		System.out.println("SurfaceArea = "+surfacearea+" "+"Volume = "+volume);
	}

	public float lenght;
	public float width;
	public float radius;
	protected float area;
	protected float perimeter;
	public float surfacearea;
	public float volume;
}
	abstract class Shape2D extends Shape{

		public float getArea() {
			return area;
		}
		public void setArea(float area) {
			this.area = area;
		}
		public float getPerimeter() {
			return perimeter;
		}
		public void setPerimeter(float perimeter) {
			this.perimeter = perimeter;
		}
	}
	class Rectangle extends Shape2D{
		public Rectangle() {
			super();
			this.lenght = 1;
			this.width = 1;
		}
		public Rectangle(float lenght, float width) {
			super();
			this.lenght = lenght;
			this.width = width;
		
		}
		@Override
		public void calculateArea() {
			area = lenght * width;
			
		}

		@Override
		public void calculatePerimeter() {
			perimeter = 2*(lenght+width);
			
	}
		
		public void display() {
			System.out.println("Length = "+lenght+" Width = "+width);
			super.display2D();	
		}
		@Override
		public void calculateSurfaceArea() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void calculateVolume() {
			// TODO Auto-generated method stub
			
		}
	}
	class Circle extends Shape2D{
		
		public Circle(float radius) {
			super();
			this.radius = radius;
			
		}
	
	@Override
	public void calculateArea() {
	area = (float)(Math.PI *Math.pow(radius, 2));
	
	}

	@Override
	public void calculatePerimeter() {
	perimeter = 2*(float)Math.PI*radius;
	
	}
		public void display() {
			System.out.println("Radius = "+radius);
			super.display2D();
		}

		@Override
		public void calculateSurfaceArea() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void calculateVolume() {
			// TODO Auto-generated method stub
			
		}
	}
	abstract class Shape3D extends Shape{
		
		public float getSurfacearea() {
			return surfacearea;
		}

		public void setSurfacearea(float surfacearea) {
			this.surfacearea = surfacearea;
		}

		public float getVolume() {
			return volume;
		}

		public void setVolume(float volume) {
			this.volume = volume;
		}

		public float getHeight() {
			return height;
		}

		public void setHeight(float height) {
			this.height = height;
		}
		
		public float height;
	}
	class Cuboid extends Shape3D{
		
		public Cuboid(float lenght, float width, float height) {
			super();
			this.lenght = lenght;
			this.width = width;
			this.height = height;
		}

		@Override
		public void calculateSurfaceArea() {
			surfacearea = 2 * (lenght * width + width * height + lenght * height);		
		}

		@Override
		public void calculateVolume() {
			volume = lenght * width * height;	
		}
		public void display() {
			System.out.println("Length = "+lenght+" "+"Width = "+width+" "+"Heigth = "+height);
			super.display3D();
		}

		@Override
		public void calculateArea() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void calculatePerimeter() {
			// TODO Auto-generated method stub
			
		}
	}
	class Sphere extends Shape3D{

		public Sphere(float radius) {
			super();
			this.radius = radius;
		}

		@Override
		public void calculateSurfaceArea() {
			surfacearea = 4*(float)(Math.PI *Math.pow(radius, 2));	
		}

		@Override
		public void calculateVolume() {
			volume = (4/3)*(float)(Math.PI *Math.pow(radius, 3));
			
		}
		public void display() {
			System.out.println("Radius = "+radius);
			super.display3D();
		}

		@Override
		public void calculateArea() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void calculatePerimeter() {
			// TODO Auto-generated method stub
			
		}

	}