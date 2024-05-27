package week02.day1;

public class Car {
//    Készíts egy w02d01.Car osztályt, mely attribútumként tárolja,
//    hogy hány litert a tankoltunk bele,
//    és hány kilométert ment el ekkora mennyiségű üzemanyaggal.
//    Mindkét attribútumhoz legyen setter metódus!
//    Legyen egy metódus ami kiszámolja az autó átlag fogyasztását,
//    azaz azt hogy 100km távolságon mennyit fogyasztott átlagosan.


    private int filledGas;
    private int kmTraveled;

    public void setGasInTank(int filledGas) {
        this.filledGas = filledGas;
    }

    public void setKmTraveled(int kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public double getAverageConsumption() {
        return filledGas / (kmTraveled / 100.0);
    }

}
