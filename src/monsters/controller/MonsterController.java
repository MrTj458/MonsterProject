package monsters.controller;

import monsters.model.Monster;
import monsters.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private Scanner monsterScanner;
	private Monster DwaneMonster;
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
		DwaneMonster = new Monster(name, BellyButton, eyes, noses, legs, hair, arms);
	}
	
	public void start()
	{
		myDisplay.displayInfo(DwaneMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster Info: " + DwaneMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Enter a new name for your monster");
		String newMonsterName = monsterScanner.next();
		DwaneMonster.setMonsterName(newMonsterName);
		
		System.out.println("How many eyes will your new monster have?");
		int newMonsterEyes = monsterScanner.nextInt();
		DwaneMonster.setMonsterEyes(newMonsterEyes);
		
		System.out.println("How many noses will your new monster have?");
		int newMonsterNoses = monsterScanner.nextInt();
		DwaneMonster.setMonsterNoses(newMonsterNoses);
		
		System.out.println("How many legs will your monster have?");
		double newMonsterLegs = monsterScanner.nextDouble();
		DwaneMonster.setMonsterLegs(newMonsterLegs);
		
		System.out.println("How many arms will your monster have?");
		double newMonsterArms = monsterScanner.nextDouble();
		DwaneMonster.setMonsterLegs(newMonsterArms);
		
		System.out.println("How many hairs will your monster have?");
		double newMonsterHairs = monsterScanner.nextDouble();
		DwaneMonster.setMonsterLegs(newMonsterHairs);
		
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
		DwaneMonster.setMonsterBellyButton(newMonsterBellyButton);
	}
}
