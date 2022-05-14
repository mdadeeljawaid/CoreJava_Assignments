package fundamentals;

public class Operators {

	public static void main(String[] args) {
		int a=100, b=20;
		
		int z1 = a++ - --b;
		//100-19=81
		int z2 = ++a - b--;
		
		System.out.println("z1="+z1);
		System.out.println("z2="+z2);
	}
}
