public class Car extends VehicleAbstract{
private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors; 
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started. Vroom! Vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

}
