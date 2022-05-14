package hridaysirdoubtclass;

abstract class Animal{
	
    abstract  public  void talk() ;//prototype,rule
	
}

//Inheritance
class Dog  extends Animal{
	//method overriding
     public void talk(){    	 
    	 System.out.println("dog barks");    	 
     }
     public void show() {
    	 System.out.println("show from dog");
     }
}
class Lion extends Animal{
	//overriding	
	public void talk(){    	 
   	 System.out.println("Lion roars");    	 
    }
}

public class AbstractDemo {
	
	public static void callTalk(Animal animal) {
		
		animal.talk();
	}
	
	public static void main(String[]args)
	{
		/*
		Dog dogObj=new Dog();		
		dogObj.talk();	
		dogObj.show();
		//int x;
		Lion lionObj=new Lion();		
		lionObj.talk();		
		//Animal animalObj=new Animal();//not allowed bcz animal is Abstract class
		
		Animal animalRef=new Dog();		
		animalRef.talk();//	talk for Dog
		//animalRef.show();
        animalRef=new Lion();		
		animalRef.talk();//talk for Lion	
		*/
		
		AbstractDemo.callTalk(new Dog());
		AbstractDemo.callTalk(new Lion());	
		
	}

}