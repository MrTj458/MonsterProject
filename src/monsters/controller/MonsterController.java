package monsters.controller;

import monsters.model.Monster;
import monsters.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private Scanner monsterScanner;
	private Monster dwaneMonster;
	private Monster userMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "Dwane";
		int eyes = 2;
		int noses = 0;
		double legs = 1.9;
		double arms = 2.0;
		double hair = 2.5;
		boolean BellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		dwaneMonster = new Monster(name, BellyButton, eyes, noses, legs, hair, arms);
	}
	
	public void start()
	{
		myDisplay.displayInfo(dwaneMonster.toString());
		createUserMonster();
		myDisplay.displayInfo("User monster Info: " + userMonster.toString());
	}
	
	private void askQuestions()
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
		
		System.out.println("Will your monster have a belly button? [y/n]");
		String usrBellyButton = monsterScanner.next();
		boolean newMonsterBellyButton;
		if (usrBellyButton.equals("y"))
		{
			newMonsterBellyButton = true;
		}
		else if (usrBellyButton.equals("n"))
		{
			newMonsterBellyButton = false;
		}
		else
		{
			System.out.println("Unknown response setting to false");
			newMonsterBellyButton = false;
		}
		dwaneMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
	
	/**
	 * Creates a Monster instance from user input.
	 */
	private void createUserMonster()
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
		
		System.out.println("How mnay arms will your monster have?");
		double userArms = monsterScanner.nextDouble();
		
		//Step two: Build the monster using the constructor.
		userMonster = new Monster(userName, userHasBellyButton, userEyes, userNoses, userLegs, userHair, userArms);
	}
}
