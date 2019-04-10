package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	private ArrayList<Colour> Colours = new ArrayList<Colour>();
	private ArrayList<Resistor> Resistors = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadData();
		printColours();
	}

	//load in data from file
	private void loadData()
	{
		Table table = loadTable("colours.csv", "header");

		for(TableRow row : table.rows())
		{
			Colour colour = new Colour(row);
			Colours.add(colour);
		}

		table = loadTable("resistors.csv", "header");

		for(TableRow row : table.rows())
		{
			Resistor resistor = new Resistor(row.getInt("value"));
			Resistors.add(resistor);
		}
	}

	//Display contents of Colours
	private void printColours()
	{
		for(Colour colour: Colours)
		{
			System.out.println(colour);
		}
	}

	//Find Colour based on value
	public Colour findColour(int val)
	{
		for(int i = 0; i < Colours.size(); i++)
		{
			if(Colours.get(i).value == val)
			{
				return Colours.get(i);
			}
		}

		return null;
	}
	
	public void draw()
	{			
	}
}
