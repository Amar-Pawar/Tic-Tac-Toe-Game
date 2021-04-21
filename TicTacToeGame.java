public class TicTacToeGame {
	//constants
	private static final int USER=1;
	private static final int COMPUTER=2;
	private static final int EMPTY=0;

	//method to print the borad by creating multi dimentional 2D array
	public static void print_board(int[][] board) {
	        System.out.print(printChar(board[0][0]));
	        System.out.print("|");
	        System.out.print(printChar(board[0][1]));
	        System.out.print("|");
	        System.out.println(printChar(board[0][2]));
	        System.out.println("-----");
	        System.out.print(printChar(board[1][0]));
	        System.out.print("|");
	        System.out.print(printChar(board[1][1]));
	        System.out.print("|");
	        System.out.println(printChar(board[1][2]));
	        System.out.println("-----");
	        System.out.print(printChar(board[2][0]));
	        System.out.print("|");
	        System.out.print(printChar(board[2][1]));
	        System.out.print("|");
	        System.out.println(printChar(board[2][2]));
	        }
	 
	 public static char printChar(int b) {
	       
	        switch(b) {
	        case EMPTY:
	            return ' ';
	        case USER:
	            return 'X';
	        case COMPUTER:
	            return 'O';
	        }
	        return ' ';
	    } 
	public static void main(String[] args){
		System.out.println("Welcome to Tic Tac Toe Game");

		int turn;
		//creating  multidimentional array
		int[][] board = new int[3][3];
		//calling method to print the board
		print_board(board);
	}
}