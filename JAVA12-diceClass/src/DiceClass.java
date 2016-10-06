/*
 * This program is part of my learning Java series
 * This one looks at an introduction to classes
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-12-introducing-classes.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class DiceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	
	//Methods
	public void setNumSides (int sides)
	{
		System.out.println("Set number of sides as " + sides);
		numSides = sides;
	}
	
	public int rollDice ()
	{
		diceRollValue = 1 + (int)(Math.random() * numSides);
		
		System.out.println("Rolled the number " + diceRollValue);
		return diceRollValue;
	}
	
	public int diceValue ()
	{
		return diceRollValue;
	}
	
	public boolean diceOnOrUnder (int threshold)
	{
		if (diceRollValue <= threshold)
			return true;
		else
			return false;
	}
	
	public boolean diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean diceEquals (int target)
	{
		if (diceRollValue == target)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	@Test
	public void firsttest()
	{
		DiceClass dice1 = new DiceClass();
		dice1.setNumSides(6);
		
		for (int count=0 ; count < 20 ; count ++)
		{
			dice1.rollDice();
		}
	}
}
