// This program allows two user to play a rock
// paper scissors game

import java.util.Scanner;
// Implement a rock-paper-scissor game
public class RockPaperScissorGame 
{
	// Input 
	public static void main(String[] args)
	{
		// Create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int player1;
		int player2;
		
		// Method
		System.out.printf("%s\n%s\n\n", "This is a game of rock paper scissor",
				"Rock is (0), Paper (1), Scissor (2)");
		
		System.out.printf("%s\n", "Player 1, Please enter number 0, 1 or 2"); 
		player1 = input.nextInt();
		
		System.out.printf("%s\n", "Player 2. Please enter number 0, 1 or 2");
		player2 = input.nextInt();
		
		// Conditional Statement
		if (player1 == 0 && player2 == 0)
			System.out.printf("%s\n", "Its a tie!");
		else if (player1 == 0 && player2 == 1)
			System.out.printf("%s\n", "Player 2 wins!");
		else if (player1 == 0 && player2 == 2)
			System.out.printf("%s\n", "Player 1 wins!");
		else if (player1 == 1 && player2 == 1)
			System.out.printf("%s\n", "Its a tie!");
		else if (player1 == 2 && player2 == 2)
			System.out.printf("%s\n", "Its a tie!");
		else if (player1 == 1 && player2 == 0)
			System.out.printf("%s\n", "Player 1 wins!");
		else if (player1 == 2 && player2 == 0)
			System.out.printf("%s\n", "Player 2 wins!");
		else if (player1 == 1 && player2 == 2)
			System.out.printf("%s\n", "Player 2 wins!");
		else if (player1 == 2 && player2 == 1)
			System.out.printf("%s\n", "Player 1 wins!");
	}	// end method main
} // end RockPaperScissor
