
/*
* Program : To demonstrate the relationship between classes
* Program By : Anil Donwade
* Date : 14/10/2021
*/
package relationships;
//Application class
public class StudentBookApplication {

	public static void main(String[] args) {
		
		//create array of pages
		Page[] pages = new Page[100];	//array of Page objects
		String pageContent="";
		int pageNumber=1;
		
		//loop to populate the array of Page, pages
		for(int p=1; p<=pages.length; p++) {
			pageContent= "This is a good Java book ";
			
			//instantiate the Page class ( create page object)
			Page page = new Page(pageNumber, pageContent);
			pages[p-1]=page;		//assign page object to particular array position
			
			//pages[p-1].setPageContent(pageContent);
			//pages[p-1].setPageNumber(pageNumber);
			pageNumber++;
		}
		
		//create book, instantiate book class
		Book book = new Book("My First Book", pages);
		
		//create student 
		Student student = new Student("Vijay", 1);
		
		//associate student with book object (USES-A relationship)
		//student.readBook(book);
		
		//-------------------------------------------------------------------------
		//school boy
				Student schoolStudent = new Student("Dipak", 10);
				
				//create array of Page objects
				Page[] mathPages = new Page[50];
				
				pageNumber=1;
				pageContent = "This is a page of Mathematics book";
				
				//loop to populate array of Page objects
				for(int p=1; p<=mathPages.length; p++) {
					
					//create Page object
					Page mathsPage = new Page(pageNumber, pageContent);
					
					//put the page into an array
					mathPages[p-1] = mathsPage;
					
					pageNumber++;
				}
				
				//create a TextBook object
				TextBook textBook = new TextBook ("Mathematics", mathPages, 9);
				
				//associate school student with book object ( USES-A relationship )
				schoolStudent.display();
				schoolStudent.readBook(textBook);

	}

}
