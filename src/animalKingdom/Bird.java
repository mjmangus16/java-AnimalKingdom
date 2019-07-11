package animalKingdom;

public class Bird extends AbstractAnimal
{
	// The class takes the same arguments as the parent class
	public Bird(String name, int year)
	{
		// super is how this class connects the variables 
		// to the parent class
		super(name, year);
	}

	// The following methods are the same methods as the ones defined
	// in the AbstractAnimal class but these ones actually include the
	// needed functionality

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int getYear()
	{
		return year;
	}

	@Override
	public void setYear(int year)
	{
		this.year = year;
	}

	@Override
	public String moveType()
	{
		return "fly";
	}

	@Override
	public String breatheType()
	{
		return "lungs";
	}

	@Override
	public String reproduceType()
	{
		return "eggs";
	}

}

















