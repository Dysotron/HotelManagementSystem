//Max Dyson
//Project 2
//28/11/16
import java.util.*;
public class Room
{
	private int noOfSBeds; //number of single beds
	private List<Bed> sBed = new ArrayList<Bed>();
	private int noOfDBeds; //number of double beds
	private List<Bed> dBed = new ArrayList<Bed>();
	private int noOfBeds; //total number of beds
	private boolean isVacant; //whether the room is vacant or not
	
	public Room() //constructor
	{
		setIsVacant(true); //rooms are empty by default
	}
	
	
	//getter and setter methods
	public int getNoOfBeds()
	{
		return noOfBeds;
	}
	
	public void setNoOfBeds()
	{
		noOfBeds = ((sBed.size()) + (dBed.size()));
	}
	
	public void setNoOfSBeds(int beds)
	{
		noOfSBeds = beds;
	}
	
	public int getNoOfSBeds()
	{
		return noOfSBeds;
	}
	
	public void setNoOfDBeds(int beds)
	{
		noOfDBeds = beds;
	}
	
	public int getNoOfDBeds()
	{
		return noOfDBeds;
	}
	
	public List<Bed> getSBed()
	{
		return sBed;
	}
	
	public List<Bed> getDBed()
	{
		return dBed;
	}
	
	public boolean getIsVacant()
	{
		return isVacant;
	}


	public void setIsVacant(boolean v)
	{
		this.isVacant = v;
	}
	
	
	// add a bed to the single bed list
	public void addSBeds(int beds)
	{
		for (int i = 0; i < beds; i++)
		{
			sBed.add(new Bed(1));
		}
	}
	
	//add a bed to the double bed list
	public void addDBeds(int beds)
	{
		for (int i = 0; i< beds; i++)
		{
			dBed.add(new Bed(2));
		}
	}
	
	//calculates occupancy of the room
	public int occupancy ()
	{
		int occupancy = 0;
		for(int i = 0; i < sBed.size(); i++)
		{
			occupancy += sBed.get(i).getSize();
		}
		
		for(int i = 0; i < dBed.size(); i++)
		{
			occupancy += dBed.get(i).getSize();
		}
		
		
		return occupancy;
	}

	
}
