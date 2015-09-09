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
}
