package week03.day5;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < maxCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int sum = 0;
        for (Passenger actual : passengers) {
            sum += actual.getNumberOfLuggage();
        }
        return sum;
    }

}
