package week03.day5;

public class Passenger {

    private String name;
    private String ticketID;
    private int numberOfLuggage;

    public Passenger(String name, String ticketID, int numberOfLuggage) {
        this.name = name;
        this.ticketID = ticketID;
        this.numberOfLuggage = numberOfLuggage;
    }

    public String getName() {
        return name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public int getNumberOfLuggage() {
        return numberOfLuggage;
    }
}
