//Max Dyson
//Project 2
//29/11/16

public class UsingHotelConfigure
{
	public static void main(String[] args)
	{
		HotelConfigure h = new HotelConfigure(); //new HotelConfigure object
		h.createHotel(); //call createHotel method from hotelConfigure
		
		for(int i = 0; i < h.getHotels().size(); i++) //prints reports for multiple hotels created
		{
			HotelReport r = new HotelReport(h.getHotel(i)); //new HotelReport object
			r.printReport(); //calls printReport method from HotelReport
		}
	}

}
