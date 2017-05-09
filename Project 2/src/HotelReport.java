//Max Dyson
//Project 2
//28/11/16

public class HotelReport
{
	Hotel hotel;
	
	public HotelReport(Hotel hotel) //constructor
	{
		setHotel(hotel); //hotel passed to report is set to hotel object above
	}
	
	public void setHotel(Hotel hotel) //setter for hotel object
	{
		this.hotel = hotel;
	}
	
	public void printReport() //prints the report on the hotel
	{
		//gives name and number of rooms
		System.out.println("The name of this hotel is: " + hotel.getName());
		System.out.println("The number of rooms in this hotel is: " + hotel.getNoOfRooms());
		
		//loops through all rooms and gives info for the room (number of beds and max occupancy)
		for(int i = 0; i<hotel.getNoOfRooms(); i++)
		{
			System.out.println("The number of beds in room " + i + " is: " + hotel.getRoom(i).getNoOfBeds());
			System.out.println("The number of double beds is " + hotel.getRoom(i).getDBed().size() + " and the number of single beds is " + hotel.getRoom(i).getSBed().size());
			System.out.println("The maximum occupancy of this room is " + hotel.getRoom(i).occupancy());
			
			//whether room is vacant or not
			if(hotel.getRoom(i).getIsVacant() == false)
			{
				System.out.println("This room is not vacant");
			}
			else
			{
				System.out.println("This room is vacant");
			}
		}
		
		//prints maximum occupancy of hotel
		System.out.println("The maximum occupancy of this hotel is " + hotel.occupancy());
		
		//prints whether the hotel has vacancies or not
		if(hotel.getHasVacancies() == false)
		{
			System.out.println("This Hotel is full");
		}
		else
		{
			System.out.println("This hotel has vacancies");
		}
	}
	


}
