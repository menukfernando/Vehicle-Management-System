public class Truck extends VehicleAbstract{
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() { 
        return payloadCapacity; 
    }

    @Override
    public void startEngine() {
        System.out.println("Start truck engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop truck engine.");
    }
}
