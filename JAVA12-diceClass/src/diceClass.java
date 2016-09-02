import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class diceClass {

	//Attributes
	private int numSides;
	private int diceRollValue;
	private boolean IsThePopeCatholic = true;
	
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
