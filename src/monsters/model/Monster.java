package monsters.model;

public class Monster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterArms;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	private Monster()
	{
		
	}
	
	public Monster(String monsterName, boolean monsterBellyButton, int monsterEyes, int monsterNoses, double monsterLegs, double monsterHair, double monsterArms)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterArms = monsterArms;
	}
	public String toString()
	{
		String bbutton;
		if (monsterBellyButton == true)
		{
			bbutton = "has";
		}
		else
		{
			bbutton = "does not have";
		}
		
		String monsterInfo = "My monster is named " + monsterName + ". He has " + monsterEyes + " eyes, "
		+ monsterNoses + " noses, " + monsterArms + " arms, " + monsterLegs + " legs, " + monsterHair + " hairs, and he " + bbutton + " a belly button.";
		
		return monsterInfo;
	}
}
