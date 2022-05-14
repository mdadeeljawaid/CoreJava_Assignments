package fundamentals;

public class NestedLoop {
	
// *
// * *
// * * *
// * * * *
/*
* total rows = 4
* 1st row asterisk : 1
* 2nd row asterisk : 2
* . . .
* 4th row asterisk : 4
* row=1 . . . row=4
*
* printing a row is repeated task
* In a single row printing an asterisk is repeated task
*/

public static void main(String[] args) {
		//repeat the row
		for (int row = 1; row <= 4; row++) {
			//repeat the column
			for (int column =1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
//number triangle (pyramid)
//. . .
		
//opposite number triangle (pyramid)
//repeat the row
		for(int row = 1; row<=4; row++) {
			for(int space = 1; space <=4-row; space++)
				System.out.print(" ");
				//repeat the column
				for(int column = 1; column <=row; column++) {
					System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
