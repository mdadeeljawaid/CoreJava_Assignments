package assignment5;

import java.util.*;

interface SlabInterface1{
	
	short SLAB_START[]= {1,101,201,501};
	short SLAB_END[]= {100,200,500,-1};
	float RATE[]= {6,7,8,9};
	
	void calculateAmount();
	int getSlab(int units);
}

class ElectricityConsumer1 implements SlabInterface {
	private int units;
	public int getSlab(int units) {
		this.units=units;
		return 0;
	}
	
	public void calculateAmount() {
		float amt;
		for(int i=0;i<4;i++) {
			amt=0;
			if(SLAB_END[i]>0) {
		if(units >=SLAB_START[i] && units<=SLAB_END[i])
		{
			amt= units*RATE[i];
		System.out.println("The Electricity bill amount: "+amt);	
		break;
		}
	}
		else {
			amt=units*RATE[i];
			System.out.println("The Electricity bill amount: "+amt);	
		}
	}
	}
}
public class Quest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int u;
		ElectricityConsumer1 ec=new ElectricityConsumer1();
		System.out.println("Enter number of units consumed: ");
		u=sc.nextInt();
		ec.getSlab(u);
		ec.calculateAmount();
	}

}