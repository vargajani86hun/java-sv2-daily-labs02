package day04;

public class Car {
    private int fuelInTank;
    private int distance;

    public double getAvgConsumption(){
        return fuelInTank * 100.0 / distance;
    }

    public int getFuelInTank() {
        return fuelInTank;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setFuelInTank(int fuelInTank) {
        this.fuelInTank = fuelInTank;
    }
}
