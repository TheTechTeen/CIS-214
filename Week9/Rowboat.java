/* 
 * CIS 214, Fall 2020
 * Author: Aiden Dow
 * Date: 11/8/2020
 * Assignment: Rowboat 
 * Comments: 
*/

import java.util.Scanner;

public class Rowboat 
{
	public static void main(String[] args) 
	{
		String[] ocean = new String[4 * 9];
		drawOcean(ocean);
		drawBoat(ocean);
		shootBoat(ocean);
		toString(ocean);
	}

	public static void drawOcean(String[] ocean)
	{
		for (int i = 0; i < ocean.length; i++) 
		{
			ocean[i] = "~";
		}
	}

	public static void drawBoat(String[] ocean)
	{
		int boatLength = 4;
		int numRows = 4;
		int numColumns = 9;

		int boatRow = 0 + (int)(Math.random() * numRows);
		int startColumn = 0 + (int)(Math.random() * (numColumns - boatLength + 1));

		for (int i = 0; i < boatLength; i++) 
		{
			ocean[(9 * boatRow) + startColumn + i] = "B";
		}
	}

	public static void shootBoat(String[] ocean)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("You get three shots to sink the rowboat.");
		int shot;

		for (int i = 0; i < 3; i++) 
		{
			System.out.println("This is shot " + (i + 1));
			System.out.printf("Enter a number between 1 and %d inclusive:\n", ocean.length);
			shot = input.nextInt() - 1;
		   
			if (ocean[shot] == "B")
			{
				ocean[shot] = "X";
				System.out.println("You sunk my rowboat!");
				return;
			}
			else
			{
				ocean[shot] = "X";
				System.out.println("You missed!\n");
			}
		}
	}

	public static void toString(String[] ocean)
	{
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				System.out.print(ocean[(9 * i) + j]);
			}
			System.out.println("");
		}
	} 
}
