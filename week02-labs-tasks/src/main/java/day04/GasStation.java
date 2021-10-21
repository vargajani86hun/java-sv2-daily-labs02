package day04;

public class GasStation {

    private int price;

    public GasStation (int price) {
        this.price = price;
    }

    public int fueling(Car car, int fuelAmount){
        car.setFuelInTank(fuelAmount);
        return fuelAmount * price;
    }
}
