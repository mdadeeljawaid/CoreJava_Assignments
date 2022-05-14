package fundamentals;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] twoDRagged=new int[4][];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<twoDRagged.length;i++) {
			System.out.println("Enter row "+(i+1)+"size");
			int size=sc.nextInt();
			twoDRagged[i]=new int[size];
		}
		
		int number=10;
		for(int i=0; i<twoDRagged.length; i++) {
			for(int j=0; j<twoDRagged[i].length; j++) {
				System.out.print(number + " ");
				number+=10;
			}
			System.out.println();
			}
		sc.close();
		}
}