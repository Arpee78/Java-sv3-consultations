package week03.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void createPassenger() {
        Passenger passenger = new Passenger("John Doe", "FK123", 3);

        assertEquals("John Doe", passenger.getName());
        assertEquals("FK123", passenger.getTicketID());
        assertEquals(3, passenger.getNumberOfLuggage());
    }

}