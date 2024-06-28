package week03.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void createPlane() {
        Plane plane = new Plane(180);
        assertEquals(180, plane.getMaxCapacity());
    }

    @Test
    void testAddPassengerCanSit() {
        Plane plane = new Plane(180);
        boolean result = plane.addPassenger(new Passenger("John", "FK123", 2));
        assertTrue(result);
        assertEquals(1, plane.getPassengers().size());
        assertEquals("FK123", plane.getPassengers().get(0).getTicketID());
    }

    @Test
    void testAddPassengerCannotSit() {
        Plane plane = new Plane(1);
        plane.addPassenger(new Passenger("John", "FK123", 2));
        boolean result = plane.addPassenger(new Passenger("Jim", "FK521", 1));
        assertFalse(result);
        assertEquals(1, plane.getPassengers().size());
    }

    @Test
    void testNumberOfPackagesEmptyPlane() {
        Plane plane = new Plane(1);
        assertEquals(0, plane.numberOfPackages());
    }

    @Test
    void testNumberOfPackages() {
        Plane plane = new Plane(180);
        plane.addPassenger(new Passenger("John", "FK123", 2));
        plane.addPassenger(new Passenger("Jim", "FK521", 1));
        assertEquals(3, plane.numberOfPackages());
    }

}