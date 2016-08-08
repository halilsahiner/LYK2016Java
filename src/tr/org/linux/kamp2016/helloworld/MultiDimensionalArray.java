package tr.org.linux.kamp2016.helloworld;

public class MultiDimensionalArray {
	
	public static void main (String args []){
	 int[][] board = new int [4][3];
	 
	 int counter =0;
	 
	 for(int j=0; j< board.length; j++){
		 for(int k=0; k< board[j].length;k++){
			 board[j][k]= counter;
			 counter++;
			 System.out.print(board[j][k]+ " ");
		 }
	 }
	 
	 for(int j=0; j< board.length; j++){
		 for(int k=0; k< board[j].length;k++){
			System.out.print(board[j][k]+ " ");
			 
		 }
		 System.out.println();
	 }
		
	}
}
