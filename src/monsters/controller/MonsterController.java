package monsters.controller;

import monsters.model.Monster;
import monsters.view.MonsterDisplay;

public class MonsterController
{
	private Monster TJMonster;
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
		
		myDisplay = new MonsterDisplay();
		TJMonster = new Monster(name, BellyButton, eyes, noses, legs, hair, arms);
	}
	
	public void start()
	{
		myDisplay.displayInfo(TJMonster.toString());
	}
}
