package day04;

public class CarMain {

    public static void main(String[] args) {
        int price;
        Car car = new Car();
        GasStation gasStation = new GasStation(495);

        price = gasStation.fueling(car, 30);
        System.out.println("A tankolás költsége: " + price + "Ft");
        car.setDistance(415);

        System.out.println("Az autó átlag fogyasztása: " + car.getAvgConsumption());
    }
}
