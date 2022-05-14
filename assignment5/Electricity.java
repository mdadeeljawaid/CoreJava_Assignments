package assignment5;

import java.util.Scanner;

interface SlabInterface{
	
	short SLAB_START[]= {1,101,201,501};
	short SLAB_END[]= {100,200,500,-1};
	float RATE[]= {6,7,8,9};
	
	void calculateAmount();
	int getSlab(int units);
}

class ElectricityConsumer implements SlabInterface {
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

public class Electricity {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int u;
		ElectricityConsumer ec = new ElectricityConsumer();
		System.out.println("Enter number of units consumed: ");
		u = sc.nextInt();
		ec.getSlab(u);
		ec.calculateAmount();
	}

}
