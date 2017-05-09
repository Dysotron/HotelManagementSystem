//Max Dyson
//Project 2
//28/11/16
import java.util.*;
public class Hotel
{
	private String name;
	private List<Room> rooms = new ArrayList<Room>();
	private boolean hasVacancies;
	
	public Hotel(String name) //constructor
	{
		setName(name);
	}
	
	
	//getter and setter methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNoOfRooms()
	{
		return rooms.size();
	}
	
	public Room getRoom(int i)
	{
		return rooms.get(i);
	}
	
	public void setHasVacancies()
	{
		for(int i = 0; i < rooms.size(); i++)
		{
			if(rooms.get(i).getIsVacant() == true)
			{
				hasVacancies = true;
			}
		}
	}
	
	public boolean getHasVacancies()
	{
		return hasVacancies;
	}
	
	
	// adds new room to the list of rooms
	public void addRoom(int i, int sBeds, int dBeds)
	{
		rooms.add(new Room());
	}
	
	//calculates and return occupancy of hotel
	public int occupancy()
	{
		int occupancy = 0;
		for(int i = 0; i < rooms.size(); i++)
		{
			occupancy += rooms.get(i).occupancy();
		}
		return occupancy;
	}
	
			
}
