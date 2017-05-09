//Max Dyson
//Project 2
//28/11/16
import java.util.*;
public class Bed
{
	private int size; //size of bed, 1 = single, 2 = double
	
	public Bed(int size) //constructor
	{
		setSize(size);
	}
	
	
	//getter and setter for size
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return size;
	}
	
}
