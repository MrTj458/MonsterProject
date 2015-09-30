package monsters.controller;

import monsters.model.Monster;
import monsters.view.MonsterDisplay;
import monsters.view.MonsterPopups;
import java.util.Scanner;

public class MonsterController
{
	private Scanner monsterScanner;
	private Monster dwaneMonster;
	private Monster userMonster;
	private MonsterDisplay myDisplay;
	private MonsterPopups myPopups;
	
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
	
	public void start()
	{
		myDisplay.displayInfo(dwaneMonster.toString());
		createUserMonsterPopups();
		myDisplay.displayInfo("User monster Info: " + userMonster.toString());
	}
	
	private void createUserMonsterPopups()
	{
		myPopups.displayResponse("Time to make a monster!");
		
		//Name
		String name = myPopups.getAnswer("What do you want to call your new monster?");
		myPopups.displayResponse(name + "? Thats an neat name!");
		
		//Eyes
		int eyes;
		String tempEyes = myPopups.getAnswer("How many eyes will it have?");
		
		while(!isInteger(tempEyes))
		{
			tempEyes = myPopups.getAnswer("Try again. How many eyes?");
		}
		
		if(isInteger(tempEyes))
		{
			eyes = Integer.parseInt(tempEyes);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting eyes to 2");
			eyes = 2;
		}
		
		myPopups.displayResponse(eyes + " eyes? Interesting choice.");
		
		//Noses
		int noses;
		String tempNoses = myPopups.getAnswer("How many noses will your monster have?");
		
		while(!isInteger(tempNoses))
		{
			tempNoses = myPopups.getAnswer("Trey again. How many noses?");
		}
		
		if(isInteger(tempNoses))
		{
			noses = Integer.parseInt(tempNoses);
		}
		else
		{
			myPopups.displayResponse("You broke the program somehow... setting noses to 1");
			noses = 1;
		}
		
		if(noses > 1)
		{
			myPopups.displayResponse(noses + "? that's quite a few noses!");
		}
		else if(noses == 1)
		{
			myPopups.displayResponse(noses + "? Thats pretty boring");
		}
		else if(noses == 0)
		{
			myPopups.displayResponse("Really no noses? Whatever.");
		}
		else
		{
			myPopups.displayResponse(noses + "? How is that possible?");
		}
	}
	
	/**
	 * Creates a Monster instance from user input in the console.
	 */
	private void createUserMonsterConsole()
	{
		//Step one: Gather user information.
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
		
		//Step two: Build the monster using the constructor.
		userMonster = new Monster(userName, userHasBellyButton, userEyes, userNoses, userLegs, userHair, userArms);
	}
	
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
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("Integers only please!");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("Doubles only please!");
		}
		
		return isDouble;
	}
	
	private boolean isBoolean(String input)
	{
		boolean isBoolean = false;
		
		try
		{
			boolean validBoolean = Boolean.parseBoolean(input);
			isBoolean = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("Booleans only please!");
		}
		
		return isBoolean;
	}
}
