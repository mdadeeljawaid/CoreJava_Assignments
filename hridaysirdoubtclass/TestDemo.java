package hridaysirdoubtclass;

//default
class Test{
	 //count=0
	  public Test() {
		  id=0;
		  count++;
		  System.out.println("default constr called");
	  }
	  
	  public Test(int id) {
		  this.id=id;
		  count++;
		  System.out.println("parametric constr called");
	  }	 
	  //mutator
    public void setId(int id) {
  	  this.id=id;  //
    }
	 //accessor/inspector
	 public int getId() {		 
		 //some logic
		 return this.id;
	 }
	 
	 public void showCount() {
		 System.out.println("object created:"+count);
	 }
	 
	/* public void getId() {		 
		 //some logic
		 System.out.print(id);
	 }*/
	 
	 int id;//class data field,non static
	static int count;//non static
}
//public
public class TestDemo {
	
	//visibility->public,default, protected, private
	//static->object independent
	//non-static->object dependent	
	public  static void main(String[]arg) {		
		  /* Test testObj;//testObj reference variable of Test type
		   testObj=new Test();//object creation
		   System.out.println("id value is:"+testObj.getId());
		   //here test_obj is instance of type Test 		   
		   testObj.setId(100);//method calling
         int id= testObj.getId();	
         System.out.println("id value is:"+id);
         
         Test testObj2=new Test();
         id= testObj2.getId();	
         System.out.println("id value is:"+id);           
         Test testObj3=new Test();
         id= testObj3.getId();	
         System.out.println("id value is:"+id);          
         
         Test testObj4=new Test(30);           
         id= testObj4.getId();	
         System.out.println("id value is:"+id);
         
         Test testObj5=new Test(60);           
         id= testObj5.getId();	
         System.out.println("id value is:"+id);
         //System.out.println(testObj.id);
        
         
		   Test t1=new Test();
		   t1.setId(100);
		   System.out.println(t1.getId());//100		   
		   Test t2=t1;
		   System.out.println(t2.getId());//100
		   t2.setId(200);
		   System.out.println(t2.getId());//200
		   System.out.println(t1.getId());//200
		   
		   Test t3=new Test(3000);
		   System.out.println(t3.getId());//3000
		   
		   Test t4=new Test();
		   System.out.println(t4.getId());//0
		   */
		
		    Test t1=new Test();
		    t1.showCount(); //1
		    
		    Test t2=new Test(2000);
		    t2.showCount(); // 2
		    Test t3=new Test();
		    t3.showCount(); //3
		    
		    t1.showCount();//3
		    t2.showCount();//3
		    Test t4=new Test(1000);
		    t4.showCount(); // 4
		    t1.showCount();//4
		    t2.showCount();//4
		   
		   
         
         
	}

}