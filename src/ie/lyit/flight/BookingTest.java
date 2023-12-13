package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	
	private Booking booking1;
	
	@Before
	public void setUp() throws Exception {
		booking1 = new Booking(new Flight(), new Flight(), new ArrayList<Passenger>());
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testBooking()
	{
		Booking b = new Booking(new Flight(), new Flight(), new ArrayList<Passenger>());
	}
	
	@Test
	public void testSetOutboundFlight() {
		booking1.setOutboundFlight(new Flight());
		assertTrue("Flight should be ",booking1.getOutboundFlight());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetOutboundFlightForException() {
		booking1.setOutboundFlight(null);
	}

	@Test
	public void testSetPassengers() {
		booking1.setPassengers(new ArrayList<Passenger>());
		assertTrue("Passengers should be",booking1.getPassengers());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetPassengersForException() {
		booking1.setPassengers(new ArrayList<Passenger>());
	}

}
