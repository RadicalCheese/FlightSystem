package ie.lyit.flight;

import java.util.ArrayList;

public class Booking {
	
	//instance variables
	private Flight outbound;
	private Flight inbound;
	private double totalPrice;
	private int bookingNo;
	private static int nextUniqueBookingNumber = 1000;
	
	//arraylist of passengers
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

	
	public Booking(Flight oF, Flight iF, ArrayList <Passenger> p)
	{
		//making sure there are between 1 and 9 passengers per booking
		if(passengers.size() >= 1 && passengers.size() <=9)
		{
			//outbound cannot be null
			//try catch statement to throw null pointer exception
			try {
				this.outbound = oF;
			}
			catch(NullPointerException e)
		    {
		         System.out.print("NullPointerException Thrown");
		    }
			this.inbound = iF;
			this.passengers = p;
			//next booking number is one added on to the previous one
			bookingNo = nextUniqueBookingNumber++;
			totalPrice = calculatePrice();
		}
		else
		{
			System.out.print("Invalid Credentials. Booking could not be created.");
		}
	}
	
	@Override
	//returns booking number, flight details, passengers and total price of booking
	public String toString()
	{
		   String s = "BOOKING NUMBER "+bookingNo+
				   "OUTBOUND FLIGHT "+outbound+
				   "INBOUND FLIGHT "+inbound+
				   "PASSENGERS "+passengers+
				   "TOTAL PRICE "+totalPrice;
		   
		   return s;
	}
	
	//equals method
	public boolean equals(Object obj) 
	{
		Booking bObject;
		   if (obj instanceof Booking)
			   bObject = (Booking)obj;
		   else
		       return false;
		 
		   return this.bookingNo==bObject.bookingNo;
	}
	
	//find passenger in arraylist
	public boolean findPassenger(Passenger p)
	{
		//check if passengers arraylist contains passenger object
		if(passengers.contains(p))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//calculate total price of flight 
	public double calculatePrice()
	{
		return totalPrice = (outbound.getPrice() + inbound.getPrice()) * passengers.size();
	}
	
	
	
	
	//get and set methods
	public Flight getOutboundFlight()
	{
		return outbound;
	}
	
	//set outbound flight
	public void setOutboundFlight(Flight outbound)
	{
		this.outbound = outbound;
	}
	
	//get inbound flight
	public Flight getInboundFlight()
	{
		return inbound;
	}
	
	//set inbound flight
	public void setInboundFlight(Flight inbound)
	{
		this.inbound = inbound;
	}
	
	//get booking number
	//no set method as system sets number automatically
	public int getBookingNumber()
	{
		return bookingNo;
	}
	
	// get passengers
	public ArrayList<Passenger> getPassengers()
	{
		return passengers;
	}
		
	//set passengers
	public void setPassengers(ArrayList<Passenger> passengers)
	{
		this.passengers = passengers;
	}
	
	
	//get total price
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	//set total price
	public void setTotalPrice(double totalPrice)
	{
		calculatePrice();
	}
	
}
