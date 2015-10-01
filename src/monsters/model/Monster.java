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
	
	//Getters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterArms()
	{
		return monsterArms;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	//Setters
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterArms(double monsterArms)
	{
		this.monsterArms = monsterArms;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	//Methods
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
		
		String monsterInfo = monsterName + ". He has " + monsterEyes + " eyes, "
		+ monsterNoses + " noses, " + monsterArms + " arms, " + monsterLegs + " legs, " + monsterHair + " hairs, and he " + bbutton + " a belly button.";
		
		return monsterInfo;
	}
}
