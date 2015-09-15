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
		System.out.println("Enter a new name for your monster: ");
		String newMonsterName = monsterScanner.next();
		DwaneMonster.setMonsterName(newMonsterName);
	}
}
