// Try this 7-1
//
// Build a subclass of Vehicle for trucks.

class Vehicle implements IVehicle {
    private int passengers; // number of passengers
    private int fuelcap;    // fuel capacity in gallons
    private int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for a Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
    public int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    public double fuelNeeded(int miles) {
        return (double) miles/mpg;
    }
}

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap;  // cargo capacity in pounds

    // This is a constructor for Truck
    Truck(int p, int f, int m, int c) {
        // Initialize Vehicle members using Vehicle's constructor.
        super(p,f,m);

        cargocap = c;
    }

    // Accessor methods for cargocap.
    int getCargo() {return cargocap;}
    void putCargo(int c) {cargocap = c;}
}

class TruckDemo {
    public static void main(String[] args) {
        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles, semi needs " + gallons + " gallons of fuel.");

        gallons = pickup.fuelNeeded(dist);
        System.out.println();
        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles, pickup needs " + gallons + " gallons of fuel.");
    }
}