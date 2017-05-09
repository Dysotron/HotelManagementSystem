//Max Dyson
//Project 2
//29/11/16
import java.util.*;

public class HotelConfigure
{
	private List<Hotel> hotels = new ArrayList<Hotel>(); //list of hotels that will be added to as new hotels are created 
	private int sBeds = 0;
	private int dBeds = 0;

	public void createHotel()
	{
		Scanner s = new Scanner(System.in);
		String name = "";
		boolean addRoom = true; //whether the user wants to add a new room - starts true as each hotel must have at least one room
		boolean addHotel = true; //whether to user wants to add a new hotel - starts true as we must have at least one hotel
		int roomI = 0; //index for rooms
		int hotelI = 0; //index for hotels

		while (addHotel == true)
		{
			addRoom = true; //resets as will be set to false after last hotel was created
			roomI = 0; //reset index as it will not be equal to zero after last hotel
			System.out.println("To create a new hotel, first enter its name:");
			name = s.nextLine();
			getHotels().add(new Hotel(name));
			System.out.println("We will now add rooms to the hotel.");
			System.out.println("We will start with one room, but more can be added.");

			while (addRoom == true)
			{
				setNoOfSBeds(roomI); //sets the number of single beds
				setNoOfDBeds(roomI); //sets the number of double beds
				getHotels().get(hotelI).addRoom(sBeds, dBeds, roomI); //adds a new room to the hotel
				getHotels().get(hotelI).getRoom(roomI).addSBeds(sBeds); //adds single beds
				getHotels().get(hotelI).getRoom(roomI).addDBeds(dBeds); //adds double beds
				getHotels().get(hotelI).getRoom(roomI).setNoOfBeds(); //sets total number of beds
				
				System.out.println("Would you like to add another room? (Yes/No)");
				String answer = s.nextLine();
				
				while (!answer.toLowerCase().equals("no") && !answer.toLowerCase().equals("yes")) //checks whether user's input is valid
				{
					System.out.println("That input is not recognised, please enter 'Yes' or 'No'"); //try again if not, until input is valid answer
					answer = s.nextLine();
				}
				
				if (answer.toLowerCase().equals("no"))
				{
					addRoom = false; //if user doesn't want more rooms, while loop will not run again
				}
				
				//nothing changes if user wants more rooms
				
				System.out.println("Is this room vacant? (Yes/No)");
				answer = s.nextLine();
				
				while (!answer.toLowerCase().equals("no") && !answer.toLowerCase().equals("yes")) //checks whether user's input is valid
				{
					System.out.println("That input is not recognised, please enter 'Yes' or 'No'"); //try again if not, until input is valid answer
					answer = s.nextLine();
				}
				
				if (answer.toLowerCase().equals("no"))
				{
					getHotels().get(hotelI).getRoom(roomI).setIsVacant(false); //if user doesn't want more rooms, while loop will not run again
				}
				
				//nothing changes if the answer is yes as rooms are vacant by default
				
				getHotels().get(hotelI).setHasVacancies(); //update whether the hotels has vacancies or not
				
				roomI++; //index incremented so next room created is added at a new point in the list

			}
			System.out.println("Would you like to add another hotel? (Yes/No)");
			String answer = s.nextLine();

			//same as above, but for hotels
			while (!answer.toLowerCase().equals("no") && !answer.toLowerCase().equals("yes"))
			{
				System.out.println("That input is not recognised, please enter 'Yes' or 'No'");
				answer = s.nextLine();
			}
			if (answer.toLowerCase().equals("no"))
			{
				System.out.println("Here");
				addHotel = false;
			}
			
			hotelI++;
		}
	}

	//getter methods
	public Hotel getHotel(int i)
	{
		return getHotels().get(i);
	}

	public List<Hotel> getHotels()
	{
		return hotels;
	}
	
	
	//gets the user's input for the number of single beds, also checks input is valid int
	public void setNoOfSBeds(int index)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of single beds in room " + index);
		
		try//tries to turn the input string into an int
        {
           sBeds = Integer.parseInt(s.nextLine());
           
        }
        catch (NumberFormatException ex)//if the NumberFormatException error is thrown in the try, it is "catched" and this code is executed
        {
        	System.out.println("Your input was not a valid integer");
        	setNoOfSBeds(index);
        }
	}
	
	//gets the user's input for the number of double beds, also checks input is valid int
		public void setNoOfDBeds(int index)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter the number of double beds in room " + index);
			
			try//tries to turn the input string into an int
	        {
	           dBeds = Integer.parseInt(s.nextLine());
	           
	        }
	        catch (NumberFormatException ex)//if the NumberFormatException error is thrown in the try, it is "catched" and this code is executed
	        {
	        	System.out.println("Your input was not a valid integer");
	        	setNoOfDBeds(index);
	        }
		}


}
