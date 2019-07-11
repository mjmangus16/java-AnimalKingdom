package animalKingdom;

public abstract class AbstractAnimal
{
	private static int maxId = 0;
	int id;
	String name;
	int year;

	public AbstractAnimal(String name, int year)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.year = year;
	}

	// abstract methods are the methods that ALL classes will be using
	public abstract String getName();
	public abstract void setName(String name);
	public abstract int getYear();
	public abstract void setYear(int year);
	public abstract String moveType();
	public abstract String breatheType();
	public abstract String reproduceType();

	@Override
	public String toString()
	{
		return "The " + name + " was named in " + year + ".\nIt can " +
				moveType() + ", breathe with " + breatheType() + 
				" and reproduces through " + reproduceType() + ".";
	}
}