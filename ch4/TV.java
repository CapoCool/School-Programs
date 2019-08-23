//Program Name: TV.java
//Author Name: Dillan Poorman
//Class Name: CSC110AA
//Date: 4/2/2018
//Description
package ch4;

public class TV 
{
	private int channel;
	private int volume;
	private boolean on;
	private int maxChannel;
	private int maxVolume ;
	
	public TV() 
	{
		channel = 1;
		volume = 1;
		on = false;
	}
	
	//getter for channel
	public int getChannel() 
	{
		return channel;
	}
	
	//getter for volume
	public int getVolume() 
	{
		return volume;
	}
	
	//getter for on
	public boolean isOn()
	{
		return on;
	}
	
	//getter for max channel
	public int getMaxChannel()
	{
		return maxChannel;
	}
	
	//getter for max volume
	public int getMaxVolume()
	{
		return maxVolume;
	}
	
	//setter for channel with conditions
	public void setChannel(int someChannel)
	{
		if (on && someChannel >= 1 && someChannel <= maxChannel)
			channel = someChannel;
	}
	
	//setter for volume with conditions
	public void setVolume(int someVolume)
	{
		if (on && someVolume >= 1 && someVolume <= maxVolume)
			volume = someVolume;
	}
	
	//setter for max channel
	public void setMaxChannel(int maxC)
	{
		maxChannel = maxC;
	}
	
	//setter for max volume
	public void setMaxVolume(int maxVol)
	{
		maxVolume = maxVol;
	}
	
	//setter for on = true
	public void turnOn()
	{
		on = true;
	}
	
	//setter for on = false
	public void turnOff()
	{
		on = false;
	}
	
	//sets channel up if condition is true
	public void channelUp()
	{
		if (on == true && channel == maxChannel)
			channel = 1;
		else 
			channel++;
			
	}
	
	//set channel down if condition is true
	public void channelDown()
	{
		if(on == true && channel > 1)
			channel--;
		else
			channel = maxChannel;
	}
	
	//set volume up if condition is true
	public void volumeUp()
	{
		if(on == true && volume <= maxVolume )
			volume++;
		else
			volume = 1;
	}
	
	//sets volume down if condition is true
	public void volumeDown()
	{
		if(on == true && volume > 0)
			volume--;
		else
			volume = maxVolume;
	}
	
	//toString method
	public String toString()
	{
		return ("\n        channel: " + channel + "\n        volume: " + volume + "\n     "
				+ "   on: " 
				+ String.valueOf(on) + "\n        maxChannel: " + maxChannel
				+ "\n        maxVolume: " + maxVolume);
	}
}
