package monsters.controller;

import java.util.Scanner;
import monsters.model.Monster;
import monsters.view.MonsterDisplay;
import monsters.view.MonsterPopups;

/**
 * Main controller method for the whole program.
 * 
 * @author MrTj458
 * @version 1.0 9/30/15
 */
public class MonsterController
{
	private Scanner monsterScanner;
	private Monster dwaneMonster;
	private Monster userMonster;
	private MonsterDisplay myDisplay;
	private MonsterPopups myPopups;

	/**
	 * Creates the default monster and initializes all of the objects.
	 */
	public MonsterController()
	{
		String name = "Dwane";
		int eyes = 2;
		int noses = 0;
		double legs = 1.9;
		double arms = 2.0;
		double hair = 2.5;
		boolean BellyButton = true;

		myPopups = new MonsterPopups();
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		dwaneMonster = new Monster(name, BellyButton, eyes, noses, legs, hair, arms);
	}

	/**
	 * Runs all of the needed methods for the program to work.
	 */
	public void start()
	{
		myDisplay.displayInfo("Hello there!");
		myPopups.displayResponse("My monster is named " + dwaneMonster.toString() + " You should make a monster too!");
		createUserMonsterPopups();
		myPopups.displayResponse("Your monster is named " + userMonster.toString());
	}

	/**
	 * Uses popups to create a new monster from user input.
	 */
	private void createUserMonsterPopups()
	{
		myPopups.displayResponse("Time to make a monster!");

		// Name
		String name = myPopups.getAnswer("What do you want to call your new monster?");
		myPopups.displayResponse(name + "? Thats an neat name!");

		// Eyes
		int eyes;
		String tempEyes = myPopups.getAnswer("How many eyes will it have?");

		while (!isInteger(tempEyes))
		{
			tempEyes = myPopups.getAnswer("Try again. How many eyes?");
		}

		if (isInteger(tempEyes))
		{
			eyes = Integer.parseInt(tempEyes);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting eyes to 2");
			eyes = 2;
		}

		if (eyes > 1)
		{
			myPopups.displayResponse(eyes + " eyes? that's quite a few eyes!");
		}
		else if (eyes == 1)
		{
			myPopups.displayResponse(eyes + " eye? A cyclops!");
		}
		else if (eyes == 0)
		{
			myPopups.displayResponse("Really? " + eyes + " eyes? Whatever.");
		}
		else
		{
			myPopups.displayResponse(eyes + " eyes? How is that possible?");
		}

		// Noses
		int noses;
		String tempNoses = myPopups.getAnswer("How many noses will your monster have?");

		while (!isInteger(tempNoses))
		{
			tempNoses = myPopups.getAnswer("Try again. How many noses?");
		}

		if (isInteger(tempNoses))
		{
			noses = Integer.parseInt(tempNoses);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting noses to 1");
			noses = 1;
		}

		if (noses > 1)
		{
			myPopups.displayResponse(noses + " noses? that's quite a few noses!");
		}
		else if (noses == 1)
		{
			myPopups.displayResponse(noses + " nose? Thats pretty boring");
		}
		else if (noses == 0)
		{
			myPopups.displayResponse("Really no noses? Whatever.");
		}
		else
		{
			myPopups.displayResponse(noses + " noses? How is that possible?");
		}

		// Legs
		double legs;
		String tempLegs = myPopups.getAnswer("How many legs will your monster have?");

		while (!isDouble(tempLegs))
		{
			tempLegs = myPopups.getAnswer("Try again. How many legs?");
		}

		if (isDouble(tempLegs))
		{
			legs = Double.parseDouble(tempLegs);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting legs to 2");
			legs = 2;
		}

		if (legs > 1)
		{
			myPopups.displayResponse(legs + " legs? that's quite a few legs!");
		}
		else if (legs == 1)
		{
			myPopups.displayResponse(legs + " leg? Thats interenting.");
		}
		else if (legs == 0)
		{
			myPopups.displayResponse("Really no legs? Whatever.");
		}
		else
		{
			myPopups.displayResponse(legs + " legs? How is that possible?");
		}

		// Arms
		double arms;
		String tempArms = myPopups.getAnswer("How many arms will your monster have?");

		while (!isDouble(tempArms))
		{
			tempArms = myPopups.getAnswer("Try again. How many arms?");
		}

		if (isDouble(tempArms))
		{
			arms = Double.parseDouble(tempArms);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting arms to 2");
			arms = 2;
		}

		if (arms > 1)
		{
			myPopups.displayResponse(arms + " arms? that's quite a few arms!");
		}
		else if (arms == 1)
		{
			myPopups.displayResponse(arms + " arm? Thats interenting.");
		}
		else if (arms == 0)
		{
			myPopups.displayResponse("Really no arms? Whatever.");
		}
		else
		{
			myPopups.displayResponse(arms + " arms? How is that possible?");
		}

		// hair
		double hair;
		String tempHair = myPopups.getAnswer("How many hairs will your monster have?");

		while (!isDouble(tempHair))
		{
			tempHair = myPopups.getAnswer("Try again. How many hairs?");
		}

		if (isDouble(tempHair))
		{
			hair = Double.parseDouble(tempHair);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting hair to 10");
			hair = 10;
		}

		if (hair > 1)
		{
			myPopups.displayResponse(hair + " hairs? that's a good amount");
		}
		else if (hair == 1)
		{
			myPopups.displayResponse(hair + " hair? Thats interenting.");
		}
		else if (hair == 0)
		{
			myPopups.displayResponse("Really no hair? Whatever.");
		}
		else
		{
			myPopups.displayResponse(hair + " hair? How is that possible?");
		}

		// Bellybutton
		boolean bellyButton;
		String tempButton = myPopups.getAnswer("Will your monster have a belly button? true or false?");

		while (!isBoolean(tempButton))
		{
			tempButton = myPopups.getAnswer("Try agin. Bellybutton? true or false?");
		}

		if (isBoolean(tempButton))
		{
			bellyButton = Boolean.parseBoolean(tempButton);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting bellybutton to false");
			bellyButton = false;
		}

		myPopups.displayResponse("Nice choice!");
		myPopups.displayResponse("Your monster is ready want to see it?");

		// Create monster
		userMonster = new Monster(name, bellyButton, eyes, noses, legs, hair, arms);
	}

	/**
	 * Checks to see if the given string can be parsed as an integer.
	 * 
	 * @param input
	 * @return isInt as a boolean.
	 */
	private boolean isInteger(String input)
	{
		boolean isInt = false;

		try
		{
			@SuppressWarnings("unused")
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("Integers only please!");
		}

		return isInt;
	}

	/**
	 * Checks to see if the given string can be parsed as a double.
	 * 
	 * @param input
	 * @return isDouble as a boolean.
	 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			@SuppressWarnings("unused")
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("Doubles only please!");
		}

		return isDouble;
	}

	/**
	 * Checks to see if the given string can be parsed as a boolean.
	 * 
	 * @param input
	 * @return
	 */
	private boolean isBoolean(String input)
	{
		boolean isBoolean = false;

		if (input.equals("true") || input.equals("false"))
		{
			isBoolean = true;
		}
		else
		{
			myPopups.displayResponse("Booleans only please!");
		}

		return isBoolean;
	}

	//
	// Old code that is no longer used below.
	//

	/**
	 * Creates a Monster instance from user input in the console.
	 */
	@SuppressWarnings("unused")
	private void createUserMonsterConsole()
	{
		// Step one: Gather user information.
		System.out.println("What is your monsters name?");
		String userName = monsterScanner.nextLine();

		System.out.println("How many legs will your monster have? This is a decimal value.");
		double userLegs = monsterScanner.nextDouble();

		System.out.println("How many hairs will it have?");
		double userHair = monsterScanner.nextDouble();

		System.out.println("Does it have a belly button? Enter either 'true' or 'false'.");
		boolean userHasBellyButton = monsterScanner.nextBoolean();

		System.out.println("How many eyes will it have?");
		int userEyes = monsterScanner.nextInt();

		System.out.println("How many noses will your monster have?");
		int userNoses = monsterScanner.nextInt();

		System.out.println("How many arms will your monster have?");
		double userArms = monsterScanner.nextDouble();

		// Step two: Build the monster using the constructor.
		userMonster = new Monster(userName, userHasBellyButton, userEyes, userNoses, userLegs, userHair, userArms);
	}

	/**
	 * Original code for asking questions.
	 */
	@SuppressWarnings("unused")
	private void askQuestionsBasic()
	{
		System.out.println("Enter a new name for your monster");
		String newMonsterName = monsterScanner.next();
		dwaneMonster.setMonsterName(newMonsterName);

		System.out.println("How many eyes will your new monster have?");
		int newMonsterEyes = monsterScanner.nextInt();
		dwaneMonster.setMonsterEyes(newMonsterEyes);

		System.out.println("How many noses will your new monster have?");
		int newMonsterNoses = monsterScanner.nextInt();
		dwaneMonster.setMonsterNoses(newMonsterNoses);

		System.out.println("How many legs will your monster have?");
		double newMonsterLegs = monsterScanner.nextDouble();
		dwaneMonster.setMonsterLegs(newMonsterLegs);

		System.out.println("How many arms will your monster have?");
		double newMonsterArms = monsterScanner.nextDouble();
		dwaneMonster.setMonsterLegs(newMonsterArms);

		System.out.println("How many hairs will your monster have?");
		double newMonsterHairs = monsterScanner.nextDouble();
		dwaneMonster.setMonsterLegs(newMonsterHairs);

		System.out.println("Will your monster have a belly button? Enter 'true' or 'false'.");
		boolean newMonsterBellyButton = monsterScanner.nextBoolean();
		dwaneMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
}
