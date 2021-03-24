/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/16/2020
 * Assignment: Pebbles
 * Comments: 
*/

import java.util.Scanner;

public class Pebbles 
{
	static int pile1;
	static int pile2;
	static int pile3;
	public static void main(String[] args) 
	{
		System.out.println("Play a game of Pebbles!");
		System.out.println("You and the computer take turns removing 1-3 stones from any one pile.");
		System.out.println("Whoever takes the last stone wins.");

		pile1 = 3 + (int)(Math.random() * (10 - 3));
		pile2 = 3 + (int)(Math.random() * (10 - 3));
		pile3 = 3 + (int)(Math.random() * (10 - 3));

		String lastMove = "computer";
		while (pile1 > 0 || pile2 > 0 || pile3 > 0)
		{
			System.out.println("\nPile 1:" + pile1);
			System.out.println("Pile 2:" + pile2);
			System.out.println("Pile 3:" + pile3);
			if (lastMove == "computer")
			{
				humanMoves();
				lastMove = "player";
			}
			else
			{
				computerMoves();
				lastMove = "computer";
			}
		}

		System.out.printf("The %s wins!\n", lastMove);
	}
	static void computerMoves()
	{
		int pile = 1 + (int)(Math.random() * (3));
		int numPebbles = 1 + (int)(Math.random() * (3));

		if (pile == 1)
		{
			numPebbles = Math.min(numPebbles, pile1);
			pile1 -= numPebbles;
		}
		if (pile == 2)
		{
			numPebbles = Math.min(numPebbles, pile2);
			pile2 -= numPebbles;
		}
		if (pile == 3)
		{
			numPebbles = Math.min(numPebbles, pile3);
			pile3 -= numPebbles;
		}
		if (numPebbles == 0)
		{
			computerMoves();
			return;
		}
		
		System.out.printf("The computer takes %d from pile %d\n", numPebbles, pile);
	}
	static void humanMoves()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter which pile you want to take from and how many pebbles(1-3).");
		int pile = input.nextInt();
		int numPebbles = input.nextInt();

		if (pile == 1)
		{
			numPebbles = Math.min(numPebbles, pile1);
			pile1 -= numPebbles;
		}
		else if (pile == 2)
		{
			numPebbles = Math.min(numPebbles, pile2);
			pile2 -= numPebbles;
		}
		else if (pile == 3)
		{
			numPebbles = Math.min(numPebbles, pile3);
			pile3 -= numPebbles;
		}
		else
		{
			System.out.println("Invalid input");
			humanMoves();
			return;
		}

		if(numPebbles > 3 || numPebbles < 1)
		{
			System.out.println("Invalid input");
			humanMoves();
			return;
		}
		
		System.out.printf("You take %d from pile %d\n", numPebbles, pile);
	}
}
