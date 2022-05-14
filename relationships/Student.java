package relationships;
//1. Entity class Student
public class Student {
	
	//parameterized constructor
		public Student(String name, int rollNumber) {
			this.name = name;
			this.rollNumber = rollNumber;
		}
		
		//accessors & mutators
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		
		//behaviourial methods
		public void display() {			//method to display object data
			System.out.println(rollNumber + " "+name);
		}

		public void readBook(Book book){		//method to simulate reading of book
			//create local variable for array of pages
			Page[] pages = book.getPages();
			
			System.out.println("Student " + getName() + " is reading book:"+book.getTitle());
			
			for(int p=1; p<=pages.length; p++) {
				
				System.out.println( "reading page : " + pages[p-1].getPageNumber() +" " 
						+ pages[p-1].getPageContent());
			}
		}
		
		//class fields
		String name;
		int rollNumber;
	}

	//2. Entity class Book
	//super class for TextBook class
	class Book{
		
		//parameterized constructor
		public Book(String title, Page[] pages) {
			super();
			this.title = title;
			this.pages = pages;
		}
		//accessor and mutator
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Page[] getPages() {
			return pages;
		}
		public void setPages(Page[] pages) {
			this.pages = pages;
		}

		public void display() {
			System.out.println(title );
			
			for(int p=1; p<=pages.length; p++)
				System.out.println(pages[p-1]);
		}

		//class fields
		String title;
		Page[] pages; //composition : Book HAS-A page
	}
	
	//3. Entity class Page
	class Page {
		
		//parameterized constructor
		public Page(int pageNumber, String pageContent) {
			super();
			this.pageNumber = pageNumber;
			this.pageContent = pageContent;
		}
		
		//accessors and mutators
		public int getPageNumber() {
			return pageNumber;
		}
		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}
		public String getPageContent() {
			return pageContent;
		}
		public void setPageContent(String pageContent) {
			this.pageContent = pageContent;
		}
		
		//behaviourial methods
		public void display() {
			System.out.println(pageNumber + " "+pageContent);
		}

		//class fields
		int pageNumber;
		String pageContent;
}
	//4. 
	//subclass
	class TextBook extends Book  {
		//parameterized constructor
		public TextBook(String title, Page[] pages, int standard){
			super(title,pages);		//call to super constructor (Book class)
			this.standard=standard;
		}
		
		//getter-setter methods
		public int getStandard() {
			return standard;
		}
		public void setStandard(int standard) {
			this.standard= standard;
		}
		
		//display 
		public void display() {
			super.display();
			System.out.println("standard: "+standard);
		}
		
		//class field
		int standard;
	}
