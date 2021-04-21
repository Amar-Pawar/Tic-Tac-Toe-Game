import java.util.Scanner;
public class TicTacToeGame {
	//constants
	private static final int USER=1;
	private static final int COMPUTER=2;
	private static final int EMPTY=0;

	//creating a method to print print board
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
	 //method to return empty or x or o accordin to player
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

	//method  to giver user a choice to select X or O
	 public static String moveChoice() {
		 String computerChoice;
		 String userChoice;
		 System.out.println("Choose 1. for X and 2. for O");
		 Scanner sc = new Scanner(System.in);
		 int userChoiceNumber = sc.nextInt();
		 if (userChoiceNumber == 1) {
			  userChoice = "X";
		 }	 
			 else
			 	userChoice = "O";	
		 
		 System.out.println("You have chose: " + userChoice);
		 
		 
		 return userChoice;
	 }
		//method for creating a random  move value for computer using random 
		 public static int computerMove() {
		 int move = (int)(Math.random()*9);
		 return move;
	 }

	//method for taking user input for player move
	 public static int userMove() {
		 Scanner ac = new Scanner(System.in);
		 int move = ac.nextInt();
		 return move;
	 }
	 
	public static void main(String[] args) {

		System.out.println("Welcome to Tic Tac Toe Game");
		int turn;
		int move;
		String computerChoice;
		//creating multidimentional array
		int[][] board = new int[3][3];
		//calling a method to print board
		print_board(board);

		//calling method to select user choice
		String userChoice = moveChoice();
		if (userChoice == "X") {
			  computerChoice = "O";
			  turn = COMPUTER;
		 }	 
			 else {
			 	computerChoice = "X";
				turn = USER;
		}
		 System.out.println("You have chose: " + userChoice + " so computer gets: " + computerChoice);
		//using if else and calling move methods check for available cells
		 if (turn == USER) {
			 move = userMove();
			print_board(board);
		 }
		 else
			  move = computerMove();
		 	print_board(board);
		 }
	
	
}
