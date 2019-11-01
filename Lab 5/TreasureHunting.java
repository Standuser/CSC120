import java.util.*;
import java.lang.*;

public class TreasureHunting
{
	public static void main(String [] args)
	{
		openingMessage();

		int truePos = (int)((Math.random() * 100) + 1);
		System.out.println(truePos);
		
		Scanner reader = new Scanner(System.in);
		int guessedPos;
		
		int distance = 100;
		int prevDistance = 0;
		int difference = 0;
	
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Round " + i + ". Enter your guess: ");
			guessedPos = reader.nextInt();
			
			distance = Math.abs(guessedPos - truePos);
			
			if (distance != 0)
			{
				checkDistance(distance);
				if (i > 1)
				{
					difference = distance - prevDistance;
					checkDifference(difference);
				}
			}
			else
			{
				System.out.println("You have found the treasure!");
				break;
			}
			prevDistance = distance;	
		}
		
		if(distance != 0)
			System.out.println("The treasure was at " + truePos + ".");
	}//end main
	
	
	public static void openingMessage()
	{
		System.out.println("#####################################################");	
		System.out.println("# A treasure has been hidden at a location between  #");
		System.out.println("# 1 and 100.                                        #");
		System.out.println("# You have at most 10 chances to guess its location.#");
		System.out.println("#####################################################");
	}//end openingMessage
	
	
	public static void checkDistance(int distance)
	{
		if (1 <= distance && distance <= 3)
			System.out.println("The treasure is very close.");
		else if(2 <= distance && distance <= 5)
			System.out.println("The treasure is somewhat close.");
		else if (6 <= distance)
			System.out.println("The treasure is not close.");
	}//end checkDistance
	
	
	public static void checkDifference(int difference)
	{
		if(difference < 0)
			System.out.println("You are closer.");
		else if (difference > 0)
			System.out.println("You are farther.");
		else
			System.out.println("The same distance.");
	}//end checkDifference
	
}//end class
