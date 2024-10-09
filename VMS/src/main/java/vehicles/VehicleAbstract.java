package main.java.vehicles;

public abstract class VehicleAbstract implements Vehicle{
    private final String make;
    private final String model;
    private final int year;

    public VehicleAbstract(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}
