package game;

public class GameBackend 
{
	private String name;
	private int level;
	private int money;
	

	public GameBackend(String name1, int level1, int money1)
	{
		name = name1;
		level = level1;
		money = money1;
	}
	
	public void setName(String name2)
	{
		name = name2;
	}
	
	public void setLevel(int level2)
	{
		level = level2;
	}
	
	public void setMoney(int money2)
	{
		money = money2;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getMoney()
	{
		return money;
	}
}
