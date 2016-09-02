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

public class diceClass {

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
	
	public int diceOnOrUnder (int threshold)
	{
		if (diceRollValue <= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceOnOrOver (int threshold)
	{
		if (diceRollValue >= threshold)
			return 1;
		else
			return 0;
	}
	
	public int diceEquals (int target)
	{
		if (diceRollValue == target)
			return 1;
		else
			return 0;
	}	
	
	@Test
	public void firsttest()
	{
		diceClass dice1 = new diceClass();
		dice1.setNumSides(6);
		
		for (int count=0 ; count < 20 ; count ++)
			dice1.rollDice();
		
	}
}
