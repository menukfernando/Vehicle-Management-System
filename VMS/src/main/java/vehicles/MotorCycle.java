package main.java.vehicles;

public class MotorCycle extends VehicleAbstract {
    private int engineCapacity;

    public MotorCycle(String make, String model, int year, int engineCapacity) {
        super(make, model, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() { 
        return engineCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Start motorcycle engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop motorcycle engine.");
    }
}
