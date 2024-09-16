import java.util.ArrayList;
import java.util.List;

public class VMS {
    private List<Vehicle> vehicles;

    public VMS() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void startAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    public void stopAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }

    public void displayCarInfo(Car car) {
        System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel() + ", Year: " + car.getYear());
        System.out.println("Type: Car, Doors: " + car.getNumberOfDoors());
        System.out.println();
    }
    
    public void displayMotorCycleInfo(MotorCycle motorCycle) {
        System.out.println("Make: " + motorCycle.getMake() + ", Model: " + motorCycle.getModel() + ", Year: " + motorCycle.getYear());
        System.out.println("Type: Motorcycle, Engine Capacity: " + motorCycle.getEngineCapacity() + "cc");
        System.out.println();
    }
    
    public void displayTruckInfo(Truck truck) {
        System.out.println("Make: " + truck.getMake() + ", Model: " + truck.getModel() + ", Year: " + truck.getYear());
        System.out.println("Type: Truck, Payload Capacity: " + truck.getPayloadCapacity() + " tons");
        System.out.println();
    }
    public static void main(String[] args) {
        VMS vms = new VMS();

        vms.addVehicle(new Car("Nissan", "Altima", 2019, 2));
        vms.addVehicle(new MotorCycle("Kawasaki", "Ninja", 2020, 650));
        vms.addVehicle(new Truck("Chevrolet", "Silverado", 2018, 3.5));

        System.out.println("Starting all vehicles:");
        vms.startAllVehicles();
        System.out.println("-------------------------------");
        System.out.println("Stopping all vehicles:");
        vms.stopAllVehicles();

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vms.vehicles) {
            if (vehicle instanceof Car) {
                vms.displayCarInfo((Car) vehicle);
            } else if (vehicle instanceof MotorCycle) {
                vms.displayMotorCycleInfo((MotorCycle) vehicle);
            } else if (vehicle instanceof Truck) {
                vms.displayTruckInfo((Truck) vehicle);
            }
        }
    }
}
