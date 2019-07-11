package animalKingdom;

import java.util.*;

public class Main
{

	// Create functions to be used inside the main folder here.
	// ( ) are used to defined the datatype being pushed in and 
	// the actual data variable.
	public static void printAnimalsWithCheck(ArrayList<AbstractAnimal> animals, CheckAnimal checker)
	{
		System.out.println();
		System.out.println("***************");
		System.out.println();
		animals.forEach(animal -> {
			if (checker.check(animal))
			{
				System.out.println(animal);
				System.out.println();
			}
			
		});
		System.out.println("***************");
		System.out.println();
	}

	public static void printAnimals(ArrayList<AbstractAnimal> animals)
	{
		System.out.println();
		System.out.println("***************");
		System.out.println();
		animals.forEach(animal -> {
			
			
				System.out.println(animal);
				System.out.println();
			
			
		});
		System.out.println("***************");
		System.out.println();
	}

	public static void main(String[] args)
	{

		// Main is where you set your data for the other classes
		// that were created. So AbstractAnimal creates the structure
		// for each animal class (Bird, Fish, Mammal).

		// You create each animal through the animal class. Then each
		// animal class grabs the structure and data needed from the
		// AbstractAnimal class

		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("BigFoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);


		// Creates an array. the <..> are used to define the
		// data type that is inside the array
		ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();

		// Adds items to your array
		animals.add(panda);
		animals.add(zebra);
		animals.add(koala);
		animals.add(sloth);
		animals.add(armadillo);
		animals.add(raccoon);
		animals.add(bigfoot);
		animals.add(pigeon);
		animals.add(peacock);
		animals.add(parrot);
		animals.add(swan);
		animals.add(toucan);
		animals.add(salmon);
		animals.add(catfish);
		animals.add(perch);

		// You call the function created above the same way you would
		// call a javascript function.

		// printAnimals(animals);

		animals.sort((a1, a2) -> a1.getYear() - a2.getYear());
		animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animals.sort((a1, a2) -> a1.moveType().compareToIgnoreCase(a2.moveType()));
		
		// printAnimals(animals);

		// printAnimalsWithCheck(animals, a -> a.breatheType() == "lungs");

		printAnimalsWithCheck(animals, a ->  (a.breatheType() == "lungs") && (a.getYear() == 1758));
	}
}







