//Max Dyson
//Project 2
//30/11/16

import java.util.concurrent.ThreadLocalRandom;
public class HotelTest {

	public static void main(String[] args) 
	{	
		System.out.println("First Hotel test, some rooms vacant, some not");
		
		//declaring variables
		Hotel ritz = new Hotel("Ritz");
		int[] sBed = new int[3];
		int[] dBed = new int[3];
		
		//initialising arrays
		for(int i = 0; i< sBed.length; i++)
		{
			sBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of single beds between 1 and 3
			dBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of double beds between 1 and 3
		}
		
		
		for(int i = 0; i< sBed.length; i++)
		{
			ritz.addRoom(i, sBed[i], dBed[i]); //adds a new room with so many single and double beds
			ritz.getRoom(i).addSBeds(sBed[i]); //adds bed objects to single bed list for room
			ritz.getRoom(i).addDBeds(dBed[i]); //adds bed objects to double bed list for room
			ritz.getRoom(i).setNoOfBeds(); //sets the total number of beds in the room
			
			if(i%2 == 0) //makes it so that even numbered rooms are set to not vacant, shows that hotel will still shows as having vacancies if some rooms are not vacant.
			{
				ritz.getRoom(i).setIsVacant(false);
			}
			
			ritz.setHasVacancies(); //update whether rooms are available
		}
		HotelReport a = new HotelReport(ritz); //new report object
		a.printReport(); //prints the report
		System.out.println(); // add spacing between hotels
		
		System.out.println("Secomd Hotel test, all rooms vacant");
		
		//declaring variables
		Hotel hilton = new Hotel("Hilton");	
		//initialising arrays
		for(int i = 0; i< sBed.length; i++)
		{
			sBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of single beds between 1 and 3
			dBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of double beds between 1 and 3
		}
				
				
		for(int i = 0; i< sBed.length; i++)
		{
			hilton.addRoom(i, sBed[i], dBed[i]); //adds a new room with so many single and double beds
			hilton.getRoom(i).addSBeds(sBed[i]); //adds bed objects to single bed list for room
			hilton.getRoom(i).addDBeds(dBed[i]); //adds bed objects to double bed list for room
			hilton.getRoom(i).setNoOfBeds(); //sets the total number of beds in the room	
			hilton.setHasVacancies(); //update whether rooms are available - all should be available as this is default state
		}
		HotelReport b = new HotelReport(hilton); //new report object
		b.printReport(); //prints the report
		System.out.println(); // add spacing between hotels
		
		System.out.println("Third Hotel test, all rooms occupied");
		
		//declaring variables
		Hotel premInn = new Hotel("Premier Inn");	
		//initialising arrays
		for(int i = 0; i< sBed.length; i++)
		{
			sBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of single beds between 1 and 3
			dBed[i] = ThreadLocalRandom.current().nextInt(0, 4); //random number of double beds between 1 and 3
		}
				
				
		for(int i = 0; i< sBed.length; i++)
		{
			premInn.addRoom(i, sBed[i], dBed[i]); //adds a new room with so many single and double beds
			premInn.getRoom(i).addSBeds(sBed[i]); //adds bed objects to single bed list for room
			premInn.getRoom(i).addDBeds(dBed[i]); //adds bed objects to double bed list for room
			premInn.getRoom(i).setNoOfBeds(); //sets the total number of beds in the room	
			premInn.getRoom(i).setIsVacant(false); //all rooms will be set to not vacant
			premInn.setHasVacancies(); //update whether rooms are available - all should be available as this is default state
		}
		HotelReport c = new HotelReport(premInn); //new report object
		c.printReport(); //prints the report
		
	}

}
