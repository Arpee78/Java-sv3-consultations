package week02.day1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(400);
        System.out.println("Tankolás ára: " + gasStation.refuellCar(car, 30) + " Ft");
        car.setKmTraveled(400);
        System.out.println("Átlagfogyasztás: " + car.getAverageConsumption() + " l/100km");
    }
}
