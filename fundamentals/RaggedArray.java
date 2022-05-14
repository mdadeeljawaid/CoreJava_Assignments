
/*
* Program : To create a ragged array
* Program By : Anil Donwade
* Date : 14/10/2021
*/
package fundamentals;

public class RaggedArray {

	/*
	* 10 20 //2
	* 30 40 50 60 //4
	* 70 80 90 //3
	* 100 110 //2
	*/
	
	public static void main(String[] args) {
		
		//declare a 2D array of 4 rows
		int[][] twoDRagged = new int[4][];
		
		//create separate rows of ragged array
		twoDRagged[0] = new int[2];
		twoDRagged[1] = new int[4];
		twoDRagged[2] = new int[3];
		twoDRagged[3] = new int[2];
		
		//loop to populate the ragged array
		int number=10;
				for(int i=0; i<twoDRagged.length; i++) {
					
					//loop to calculate row values and put into a row
					for(int j=0; j<twoDRagged[i].length; j++) {
						System.out.print(number + " ");
						number+=10;
					}
					
					}
				//loop to display the ragged array
				for(int i=0; i<twoDRagged.length; i++) {
					for(int j=0; j<twoDRagged[i].length; j++)
						System.out.print( twoDRagged[i][j] + " ");
				
					System.out.println();
		}
	}

}
