package com.bridgelabz.programs;

import java.util.Scanner;

public class TicTacToe {

	static final int EMPTY = 0;
	static final int NONE = 0;
	static final int COMPUTER = 1;
	static final int USER = 2;
	static final int STALEMATE = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 = computer,2=user
		int turn = COMPUTER;// comp is starting the game

		int[][] board = new int[3][3];

		// move: 1-9
		int move;

		// winner: 0 = none, 1 =computer  2 = user, 3 = stalemate
		int winner;

		// Print Instructions
		System.out.println("This is a tic-tac-toe game");
		System.out.println("You are playing against the computer!");
		System.out.println("Enter 1-9 to indicate your move");

		print_board(board);

		// While (game not over)
		while (true) {
			if (turn == USER) // computer-->1,user-->2 ?(turn=2)
			{
				System.out.println("Your move");
				move = -1;
				while (move < 0 || move > 9 || board[move / 3][move % 3] != EMPTY) {
					System.out.println("Please enter your move(0-9): ");
					move = scanner.nextInt();

				}
			} else {
				move = computer_move(board);
				System.out.println("Computer move: " + move);// comp position
			}

			// Update the board
			board[(int) (move / 3)][move % 3] = turn;// 4

			// Print the board
			print_board(board);

			// if game is over
			winner = checkWinner(board);

			if (winner != NONE)
				break;//winner is no-one brek entire while loop

			// switch turn
			if (turn == USER) {
				turn = COMPUTER;
			} else {
				turn = USER;
			}

		} // while

		// Print out the outcome 0=none 1=computer 2=user
		switch (winner) {
		case USER:
			System.out.println("You won!");
			break;
		case COMPUTER:
			System.out.println("Computer won!");
			break;
		default:
			System.out.println("Tie!");
			break;
		}
	}// main

	// Print the board with move which having specified char value
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

	// Return an X for user turn or O comp depending upon whose move it was
	public static char printChar(int b) //move
	{
		switch (b) {
		case EMPTY:
			return ' ';
		case USER://  if 2
			return 'X';
		case COMPUTER://if 1
			return 'O';

		}
		return ' ';
	}

	// See if the game is over
	public static int checkWinner(int[][] board) {
		// Check if someone won
		// Check horizontals

		// top row
		if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			return board[0][0];// 0--->none

		// middle row
		if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			return board[1][0];// 1-->computer

		// bottom row
		if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			return board[2][0];// 2-->user

		// Check verticals

		// left column
		if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
			return board[0][0];

		// middle column
		if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			return board[0][1];

		// right column
		if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			return board[0][2];

		// Check diagonals
		// one diagonal
		if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			return board[0][0];

		// the other diagonal
		if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			return board[0][2];

		// Check if the board is full
		if (board[0][0] == EMPTY || board[0][1] == EMPTY || board[0][2] == EMPTY || board[1][0] == EMPTY
				|| board[1][1] == EMPTY || board[1][2] == EMPTY || board[2][0] == EMPTY || board[2][1] == EMPTY
				|| board[2][2] == EMPTY)
			return NONE;

		return STALEMATE;
	}

	// Generate a random computer move
	public static int computer_move(int[][] board) {
		int move = (int) (Math.random() * 9);

		while (board[move / 3][move % 3] != EMPTY)
			move = (int) (Math.random() * 9);

		return move;
	}

}// class
