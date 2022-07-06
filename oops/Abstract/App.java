package oops.Abstract;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        System.out.println(vehicle.getNoOfWheels());
        vehicle = new Auto();
        System.out.println(
                vehicle.getNoOfWheels()
        );
    }
}
